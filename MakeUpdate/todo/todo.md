Follow Pattern
--------------
1. **DONE:** **Job**
   1. **Cmd** key
   2. **Cmd** key
2. **DOING:** **Job**
   1. **Cmd** key
   2. **Cmd** key
3. **TODO:** **Job**
   1. **Cmd** key
   2. **Cmd** key

> 2018.May12.1.N.N
1. TODO: **SHARE** location image with friends
> IMPROVE UX
1. TODO: **MAKE** movable round image at smallStreetView
2. TODO: **MAKE** friends icon functional to view friends on map.
3. TODO: **ADD** cluster marker
4. TODO: **ADD** search option and **DISPLAY** search based realtime result
5. TOOD: **MAKE** Live friends functional + location based friends search feature
6. TODO: **ADD** feature: Send feedback
7. TODO: **DESIGN** like google map and **HANDLE** feedback feature. 
8. TODO: **NOTIFY** live users 
9. TODO: **MAKE** user-friendly GPS enable option (Swadesh vai faced this problem)
10. TODO: **CREATE** user friendly D icon for danger
11. TODO: **SHOW** user designation based markers with user image. (ex: police = policeMarkerIcon, student = studentMarkerIcon, agedPeople = agedMarkerIcon, girl = girlMarkerIcon, boy = boyMarkerIcon)
12. DOING: **MAKE** functional FRIEND REQUESTS NOTIFICATIONS

13. TODO: **INCREASE** streetview view rate: POINT google, fb, apple, ...etc location place
14. TODO: **INCREASE** streetview view rate: historical place
15. TODO: **SET** marker point for scientiests (einstein), mark zukerberg, bill gates
16. TODO: **MAKE** wave icon functional to notify receiver
17. TODO: **SHOW** sound & text notification when app running (like messanger).

Working Version
---------------
**RERO:** Release early, release often and listen to customer.

Previous Versions
-----------------
> 2018.May19.1.19.0
1. **ANALYZED** and **SELECTED** user friendly wave icons to interact with each other from near location.
2. **MADE** wave icon sent successful
3. **ADDED** functional phone call for parents with children
4. **DEDICATED** to Jubayer
5. **ADDED** playlagom logo at the app run
6. **CHANGED** icons of danger, user
7. **UPDATED** feature graphic
8. **MADE** open for public to install
9. **UPDATED** screenshoots

> 2018.May15.1.18.0
1. **SOLVED** logout crash issue
2. **ADDED** popup dialog at logout icon
3. **ADDED** functional one click uber feature 
4. **ADDED** one click traffic jam/status feature
5. **IMPROVED** UI + UX to help user to understand easily different features

> 2018.May14.1.17.0
1. **IMPROVED** UX by adding a small preview of location image for blackbox and dialog infoWindow feature
2. **SOLVED** issue at danger icon. Where danger icon was not showing but click event at danger icon position fired up dialog. Now, only dialog will fire up after showing danger icon.

> 2018.May13.1.16.0
1. **CREATED** close track at Play Store named **SL1160-1200** as suggested by google
2. **ADDED** full functional all/friends feature
3. **FIXED** app crash issue. Never change db manually cause this lead to occur type mismatch/null pointer exception.
4. **MADE** independent functional codebase structure: **READY TO CHANGE**

> 2018.May12.1.15.0
1. **ADDED** TabLayout, PageViewer, Fragamens where PV contains RecyclerView
2. **ADDED** functional friends feature
3. **CREATED** view & functionality (Accept/Delete) for received friend requests
4. **CREATED** view & functionality(Delete) for friend list
5. **CREATED** view for sent friend requests
6. **CHANGED** codebase structure
7. **USED** local data cache for flexibility, reliability, less server call through LinkedHashMap where List & HashMap not fit in this problem domain.

> 2018.May9.1.14.0
1. **REMOVED** method for less operational code. NO copyLoggedInUserInfoToNewStructure exists.
2. **ADDED** realtime functional friend list with addition & deletion features.

> 2018.May6.1.13.0 
1. **ADDED** functional custom dialog for infoWindow Click Event 
2. **ADDED** newly features of FRIEND REQUEST, PHONE CALL, MESSAGE
3. **CREATED** understandable user-friendly icons
4. **HANDLED** unique identity of clicked marker UID from the client side 
5. **MOVED** data from each client to new structure SH1132018MAY6
6. **CHANGED** Sign Up & Login codes
7. **REFACTORED** code of DisplayActivity to increase the quality
8. **CREATED** cluster marker feature at android-maturity

> 2018.Apr30.1.12.1
1. **FIXED** issue: functional danger feature
2. **ADDED** feature: user's last danger footprint (red surrounded) on the map
3. **CHANGED** code structure

> 2018.Apr28.1.12.0
1. **USED** developer friendly debugger at every function
2. **CHANGED** db structure<br>
-users<br>
--name<br>
--email<br>
--danger<br>
--position<br>
--online<br>
---latitude<br>
---longitude<br>
3. **HANDLED** name isNameProvided() for <= 1.6.0 users of Share Location and **STORE** name at v1.6.0 pointed db.
4. **COPIED** data to new structure db from v1.11.0 pointed db. **RUN app 2 times** 
5. **SHOWING** all registered users by default at map. **Blue markers** for all registered users by default.
6. **ENSURED** user online/offline status by onDisconnect and given marker colors (green=live users, red=at danger user, blue = not live). **TO make offline: close app -> tab notification to stop service -> clear app running history**

> 2018.Apr23.1.11.0
1. **CHANGED** marker color: green=live users, red = danger
2. **PLAYED** siren sound to others when anyone pressed on the danger button.
3. **MADE** animated marker at danger
4. **SEEN** by every live users who is at danger now

> 2018.Apr22.1.10.1
1. **SHOWING** live all
2. **FIXED** crash issues

> 2018.Apr21.1.10.0
1. **SOLVED** issue, different marker's same location image issue.
2. **ADDED** feature, camera focus point (black box)
3. **ADDED** feature, location picture icon with user-friendly functionality

> 2018.Apr18.1.9.0
1. **ADDED** danger icon and client functionality
2. **ADDED** danger sound and client functionality

> 2018.Apr15.1.8.0
1. **ADDED** streetview for better UX 
2. **AUTO SHOWING** users info at the marker 
3. **ANALYZED** streetview goog app vs streetview coding

> 2018.Apr15.1.7.0
1. **Done:** **Icon**
   1. **ADDED** functional logout icon at bottom
1. **Done:** **SIGN UP**
   1. **ADDED** name field and **MADE** functional
2. **Done:** **UPDATE** look and feel
   1. **EDIT** Name showing

> v1.5.0 & v1.6.0
1. Done 2018.Apr13 - Make user friendly position of logout button
2. Done 2018.Apr13 - Show email/name not unique id
3. Done 2018.Apr13 - Firebase Advance Querying Join [Reference1](https://dzone.com/articles/firebase-advance-querying-join-reference), [android ref](https://stackoverflow.com/questions/41135658/how-to-perform-join-query-in-firebase)

> v1.4.0
1. Done - Need automation for unique user identification during registration