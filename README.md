
![OpenCV](https://img.shields.io/badge/OpenCV-3.1-Green.svg)
![jAVA](https://img.shields.io/badge/Java-8-Green.svg)

HTTP Live Video Stream From OpenCV
===================
**en:** OpenCV is a sample project that is read from the video source (Camera, File System, NVR, DVR etc.) and displays the processed image via the http protocol. OpenCV version 3.1 is used. You can see the architecture of the project below.

**tr:** OpenCV ile video kaynağından (Kamera, Dosya Sistemi, NVR, DVR vb.) okunan ve işlenen görütüyü, http protokolü üzerinden yayınlayan örnek bir projedir. OpenCV 3.1 sürümü kullanılmıştır. Projenin mimarisini aşağıda görebilirsiniz.


### architecture

![](http://mesutpiskin.com/blog/wp-content/uploads/2017/11/HTTP-live-stream-from-OpenCV.png)

### running

If you use as follows
```sh
System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
```
set JVM parameter
```sh
-Djava.library.path=/yourpath/opencv-3.4.0/build/lib
```
or just use it
```sh
System.loadLibrary("/yourpath/opencv-3.4.0/build/lib");
#for windows
System.loadLibrary("/yourpath/opencv_java3xx");
```
### dependency

 - OpenCV 3.x or higher [Download OpenCV](https://opencv.org/releases.html)
 - Java 6 or higher
