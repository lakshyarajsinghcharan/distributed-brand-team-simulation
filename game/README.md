# Storm Royale
Original top-down battle royale for Android (HTML5 canvas in a WebView). 100 players glide in, loot weapons/shields, harvest wood, build walls, survive the shrinking storm.

- Play in browser: open `index.html` (WASD/arrows move, mouse aims, click/space fires, Q builds).
- Install: `dist/StormRoyale.apk` (sideload; signed with a self-signed debug key, minSdk 21).
- Rebuild: javac against an Android stub jar → dx → apktool `b` on `android/app/src/main` → jarsigner.
