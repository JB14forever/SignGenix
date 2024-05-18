# SignGenix

### Problem Statement:

##### Following recent statistics, over 360 million people across the globe spent their lives being mute is an inability to speak, often caused by a speech. This is an inevitable matter for those people who can’t express themselves in words through their speech. As we know the number of hearing impaired and speech impaired people in India is around 63 million out of which 50lakh are children and the same numbers on the world scale are much larger. Even it’s hard for them to manage their day-to-day activities. They also find it challenging to communicate with other people using their sign language. Thus this community relies on using sign language for communication, however, only a small percentage of people outside this community that is the number of able people who use sign language is very low, thus making it difficult for people to communicate normally with everyone else, as we know in today’s world almost everyone owns a smartphone and with the rapid development of technology we can use Computer vision machine learning and implement them into mobile applications.
##### Our main motive is to build a product that will help the mute community to live their life with more ease. So being in the digital era everyone uses a smartphone in their day-to-day life, so why not use this smartphone as a tool for communication for the mute community as well? Thus with this application, we intend to create a two-way communication channel that allows everyone to communicate freely and express their thoughts without knowing the sign language.

### Project Design
![Process Diagram](https://github.com/JB14forever/SignGenix/assets/69258864/1056471c-78fa-4d63-b3e7-4f8f9c9e9c77)


### Tech Stack
##### Software used for creating the project was Android Studio, Java, and Google Play Services. We used Android Studio to edit our codes, Input Method settings, KeyboardView for creating the SignGenix Keyboard, RecognizerIntent to recognize and analyze the speech, Hash map to store the Sign Language images, and by using Single Character matching algorithm we displayed the output using SetImageResource, CustomSwipeAdapter is used in Sign Tutorial Feature. Using the Utils library, TimeTextObject, and OnSeekBarChange Listener the Subtitles are processed and displayed on the screen. Using Gesture Library we recognized the gesture and converted it to text and displayed it on the screen.

### Implementation Section 1 – SignGenix Keyboard
##### We designed the keyboard layout in the XML resource file using SetKeyboard, the KeyboardView method that consists of alphabets in the English Language as well as their respective Sign Language images for the character. To use this feature the user needs to click the Setup input methods button and select the SignGenix keyboard then choose the SignGenix keyboard as the input method it will display the keyboard on the screen.
### Section 2 – Voice Recognition
##### We designed the basic layout of this feature in an XML file using ImageView and TextView. This feature tells the user to tap on the speaker icon and then speak after receiving the input it will go through the RecognizerIntent and will recognize and analyze the speech. Then the output is displayed on the screen in TextView with the help of ArrayList.
### Section 3 – Speech to Sign
##### We designed the interface of this feature using ImageView and a button XML code. In the first step, we used HashMap to store the sign language images of 26 alphabets and a space character. In the next step, the input is provided in the speech format and it is then internally converted into text. Then the text will go through a single character matching algorithm and display the appropriate sign language image for that character using the SetImageResource.
### Section 4 – Sign Tutorial
##### We designed the container layout for this feature in the XML file. Using CustomSwipeAdapter, ImageView, and TextView the tutorial Sign language images and the alphabet characters in text format are visible for those who wish to learn Sign language.
### Section 5 – Sign Subtitle
##### We stored the video file in the raw folder. Using Utils Library, TimeTextObject, and OnSeekBarChange listener the subtitles are processed and displayed on the screen.
### Section 6 – Gesture Recognition
##### We developed the Layout of this feature in an XML file using buttons and GestureOverlayView. The user will draw on the specified area then using Gesture Library we will recognize the Gesture and Finally convert it into Text and display it on the screen
### Connecting sections with a good User Interface
##### Without an attractive User Interface and Main Menu, the Application is not complete. We added a menu page. From there, we can navigate different features. The buttons were attached with above-mentioned functionalities.

### Results
![SS1](https://github.com/JB14forever/SignGenix/assets/69258864/341c84cb-2e2e-45dc-bd96-57634b8658d4)

![SS2](https://github.com/JB14forever/SignGenix/assets/69258864/aacbf76f-a5f5-405a-bd4e-a7a45b570f79)

### Publication
![SS3](https://github.com/JB14forever/SignGenix/assets/69258864/e0862341-8a69-414a-9fdf-aed8cf03f6d3)

### Conclusion
##### Thus, we are proposing to use Gesture, Speech, and Single Character Matching Algorithms along with Android Programming to develop this Android Application. This Application will prove to bridge the communication gap between the two communities by providing them a platform to interact with the existing knowledge of language. Our Application also has a few extra features like SignGenix Keyboard, Voice Recognition, Sign Tutorial, Sign Subtitle, and Gesture Recognition that will help the mute community to live their life more easily. This application will help the people belonging to the mute society by providing a better and more convenient means of life by communicating with other people.
