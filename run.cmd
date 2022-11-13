adb push app\build\rustJniLibs\android\arm64-v8a\libtemplate_lib.so /data/local/tmp
adb shell "LD_PRELOAD=/data/local/tmp/libtemplate_lib.so /system/bin/sh"
