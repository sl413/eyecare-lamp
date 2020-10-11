# Eyecare lamp control app

This is Android app for controlling Xiaomi Philips Eyecare Smart Lamp 2.

### For what
Xiaomi does not provide an official API for its smart devices, the only way to control them is by using the official Mi Home app.
It takes ~200MB on my Android device, during its running the phone starts to slow down and heat up, application contains ads.

### Restrictions
- The application works with devices located in the same lan (wan control protocol has not been yet cracked).
- To application detects the lamp, you must set the initial connection of the lamp to the Wi-Fi network using Mi Home app.

### Thanks
[@SG-O](https://github.com/SG-O), for [implementing](https://github.com/SG-O/miIO) the miIO protocol in Java.

I was a bit [modified](https://github.com/sl413/miIO) his library, adding the ability to control the eyecare lamp.
