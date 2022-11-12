adb push app/build/outputs/apk/debug/app-debug.apk /data/local/tmp || exit
adb push app/build/rustJniLibs/android/arm64-v8a/libtemplate_lib.so /data/local/tmp || exit
adb shell "CLASSPATH=/data/local/tmp/app-debug.apk NATIVE_PATH=/data/local/tmp/libtemplate_lib.so app_process . com.rust.template.Main" || exit
