adb push app\build\rustJniLibs\android\arm64-v8a\template_pc /data/local/tmp
adb shell "chmod u+x /data/local/tmp/template_pc; /data/local/tmp/template_pc"
