adb push app\build\rustJniLibs\android\arm64-v8a\template /data/local/tmp
adb shell "chmod u+x /data/local/tmp/template; /data/local/tmp/template"
