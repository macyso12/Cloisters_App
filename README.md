# Cloister_App
This is a research fellowship program that I have been doing with my previous univesity - Fordham Unviersity. to create a android app. 

## 06/14/2021 - 06/18/2021
- Started on creating wireframe of the app : We know that we want to make this app through Android IDE development for creating a Android application
- Researching and Learning Android IDE Development via Youtube Tutorials
- [Android App Development in Java All-in-One Tutorial Series](https://www.youtube.com/watch?v=tZvjSl9dswg)
    - Instead of finding something to stream on, we can put the podcast file inside of the app and play it within the app instead 
    - [How to Play a Sound File Using the MediaPlayer Class - Android Studio Tutorial](https://www.youtube.com/watch?v=C_Ka7cKwXW0)
- Adding the playhead and make it move while the media is player in the background 
    - [Java ( Android Studio ) Tutorial - Music Player](https://www.youtube.com/watch?v=zCYQBIcePaw)

## 06/21/2021 - 06/25/2021
- Interactive Floor Map
    - Stared on the interactive floor map - 1st floor and ground floor
    - Finish toggling menu on the button portion to navigate from ground floor to first floor + added button on the uncharted area so that after you click on the area, you can still toggle between floors
- [Figuring out which coding algorithms to use so that it will run more efficiently](https://medium.com/front-end-weekly/switch-case-if-else-or-a-lookup-map-a-study-case-de1c801d944
    - Switch case, if else or a lookup map — A study case
    - Conclude that I should use a switch statement, it runs faster compared to the others. 
- Added the overlay of “About This App” as an activity.

## 06/28/2021 - 02/07/2021
- Start making the areas to be highlighted when selected
    - Changing the background color of the button could work 
    - [How to Change the Background Color of a Button in Android using ColorStateList](https://www.youtube.com/watch?v=xWWnrh_Gks0
- Materials Needed for Next Week:
    - Each of the gallery layout with cabinets + clear instructions on which cabinets have podcast and which does not 

## 05/07/2021 - 10/07/2021
- Transition has to be smoother, instead of making two separate activity we can make one invisible and one visible and then overlay the buttons 
    - Aesthetically more pleasing
    - Can add some kind of a animation 
    - [Slide Animation Between Activites - Android Studio Tutorial](https://www.youtube.com/watch?v=0s6x3Sn4eYo)
- Also showing on the info bar about which floor the interface is currently on, because it might be not so user-friendly and sometimes users will get confused. 
- All bugs are cleared within the interactive floor map, all buttons are functioning properly. 
- The feature of making the area highlighted in red has been pushed back, because it is a features / detail thing instead of making the whole app functionable. 
    - Thought: Instead of changing the background color of the button, we could instead just show a png of the gallery layout, and overlay it on top of the main activity. 
    - It is advised to make this feature afterwards instead of making it in the process. 
- Begin to start working on the Gallery Display overlay. 
- Have added the “1st floor” and “Ground floor” indication so that the user will be able to know which floor they are on at the moment.
    - Have also added the text for “the met store” and “main entrance” because it occurs to me that if we click on other places, that is not the gallery, it just does not appear anything and it might be confusing for users to realize what they are clicking on, or whether it is a bug in the app. 

## 12/07/2021 - 16/07/2021
- Top right corner : light blue → lower transparency 
- Attempt to find a widget for the “Glass Gallery” → just like an instagram feed, a stripe of images sit underneath, and a window like a mask to set on top of it and be small visible. And then when you tap on the right and left button, it will change articles / pieces of articles. 
- Inputting all other gallery display into the app (the zoom in gallery activity) → Waiting on the png of each gallery on the 1st floor and ground floor, so that it can be highlighted when user click on it (not much of highlighting but more to show image / overlay the image on top of the floor map) 
- Horizontal text figured out, with Java 
    - TextView tv=(TextView)findViewById(R.id.GalleryName);
    - tv.setSelected(true);
        - ^ put it in onCreate and also some other hardcoding in the xml 

- Features to add : 
    - Gallery Name : Auto Scroll - sideways 
        -  [Auto scrolling (horizontal running) TextView](https://www.youtube.com/watch?v=HMUmw-cq5w4) 
    - Gallery Cabinet Changing Color : Changing color when pressed 
        - [Change button color on pressed](https://www.youtube.com/watch?v=oeqTcC35vUs)
    - Glass Gallery :
        - [How to Add Multiple Images to Horizontal Scroll View in Android](https://www.youtube.com/watch?v=hl0AcuplFwE)

## 19/07/2021 - 23/07/2021
- Working on the glass gallery carousel, and attempt to add in the highlighted png if time allow
    - [Custom Circle/Round Button in Android Studio | Custom Round ImageButton in XML](https://www.youtube.com/watch?v=bcEiMrR07kg)
- Will start working on the media really soon after I have finish all the gallery display activity.
    - [Android Infinite Auto Image Slider Using View Pager 2 | Android Studio | Java](https://www.youtube.com/watch?v=iA9iqygq11Q)
- Media player w/ play head and time stamp
    - [Java ( Android Studio ) Tutorial - Music Player ](https://www.youtube.com/watch?v=zCYQBIcePaw)

## 26/07/2021 - 30/07/2021
- Initial testing of the code for media player → the code works, what’s left to do is to plug the code into each activity for each podcast. 
    - [Java (Android Studio) Tutorial – The Simple Music Player ](https://codingwithsara.com/java-android-studio-tutorial-simple-music-player/#activity_mainxml)

## 09/08/2021 - 13/08/2021
- Started on implementing mp3 into the app 
- Fixing some placement issues in the glass gallery and the carousel 
- Researching about dynamic sizing and how to publish / mini closure for the app to publish on Google Play as an Application 
- Updated Project to Git 
    - [How to update android project on github | Tech Projects](https://www.youtube.com/watch?v=1RpW5DPzALg)
- Researching about the last step on how to publish app on Google Play Store
    - [How to Publish an Android App to Google Play 2021 | New Play Console](https://www.youtube.com/watch?v=5GHT4QtotE4)


