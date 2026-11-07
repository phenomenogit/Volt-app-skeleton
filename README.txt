VOLT — APP SKELETON (session 1)
================================

What this is
------------
A minimal, buildable Android project: one Activity, one WebView,
one bundled face page. Its only job is to prove the full chain on
your phone — CodeAssist opens it, builds it, signs it, installs it,
and Volt opens with a face and no engine. Wiring (gateway chat,
working switches, council mode) arrives in later sessions.

How to use it in CodeAssist
---------------------------
1. Unzip this project somewhere CodeAssist can see it.
2. In CodeAssist, choose Open / Import project and point it at the
   unzipped "volt-app-skeleton" folder.
3. Press Build / Run. It should compile and install as "Volt".
4. Open Volt from your app drawer: gradient face, VOLT wordmark,
   four decorative switches, one chat card.

If CodeAssist asks for anything the skeleton does not have
(an SDK level, a template choice), pick its default — and tell
Muse what it asked; session 1 exists to absorb exactly that.

Layout
------
app/src/main/AndroidManifest.xml
app/src/main/java/com/volt/app/MainActivity.java
app/src/main/assets/face/index.html   <- the face lives here
app/src/main/res/values/strings.xml

House rules baked in
--------------------
- App name: Volt. Package: com.volt.app.
- Cleartext localhost traffic allowed (the gateway lives at
  127.0.0.1:18789 on this phone only).
- No store, no fees, no account: personal build, sideloaded.
