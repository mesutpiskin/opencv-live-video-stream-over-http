English | [Türkçe](./README.tr-TR.md)

<div align="center">

<img width="100" src="./static/logo.png"/>

<h1 align="center">HTTP Live Video Stream From OpenCV</h1>

</div>


OpenCV is a sample project that is read from the video source (Camera, File System, NVR, DVR etc.) and displays the processed image via the http protocol. OpenCV version 3.1 is used. You can see the architecture of the project below.


### Architecture

<div align="center">
<img width="500" src="./static/mimari.png"/>
</div>


### Dependency

 - OpenCV 3+
 - Java 6+


### How to run

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
#for mac or linux
System.loadLibrary("/yourpath/opencv-3.4.0/build/lib");

#for windows
System.loadLibrary("/yourpath/opencv_java3xx");
```

