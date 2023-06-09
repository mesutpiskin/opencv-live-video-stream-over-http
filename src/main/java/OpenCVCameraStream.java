import org.opencv.core.*;
import org.opencv.videoio.VideoCapture;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenCVCameraStream {

    //region Properties
    public static Mat frame = null;
    private static HttpStreamServer httpStreamService;
    static VideoCapture videoCapture;
    static Timer tmrVideoProcess;
    //endregion

    //region Methods

    public static void start() {


        videoCapture = new VideoCapture();
        videoCapture.open(1);
        if (!videoCapture.isOpened()) {
            return;
        }

        frame = new Mat();
        httpStreamService = new HttpStreamServer(frame);
        new Thread(httpStreamService).start();

        tmrVideoProcess = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!videoCapture.read(frame)) {
                    tmrVideoProcess.stop(1);
                }

                //procesed image
                httpStreamService.imag = frame;
            }
        });
        tmrVideoProcess.start();
    }

    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);//Load opencv native library
        start();
    }

    //endregion

}
