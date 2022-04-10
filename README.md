# CS4500-001_CloningClones
Group repository for the CS4500-001 Cloning Clones project

How to Start:
First, open the file named game.exe. This should open the game and you should see a Welcome screen. Click on the Play Game button when you are ready to begin.

How to Set Up:
After you have selected the Play Game button, the mascot will begin explaining the rules and how to play (rules will be explained below in How to Play). The mascot will give a brief demo that will show you how to play. After that you will be asked to enter the size of the board, in which either you or the student will enter your desired size. It must be square (for example 10 by 10) and the board must be at least 8 by 8. If not specified, the board will be 8 by 8. The students will also have the option to enter a username, which will be used for a log (which will be explained below in the Log section).

How to play:
Freeing the Clones is a relatively simple game. The goal is to get all clones out of the jail (a three square section in the lower left corner as shown below with thick black borders).
To clone a clone The student must click on the circles (clones) on the game screen to try to move them out of the prison. Once clicked, a clone will move up and a new clone will appear in the cell to the right of the original position of the first clone. If there is already a clone in those cells then the move will be invalid and the clone will remain where it is.
Clicking on the right-most clone will result in the above representation. The clone highlighted in green cannot be cloned because there is a clone occupying the space to the right. If the student clicks on the highlighted clone the board will remain the same.
The clone will also not be able to clone if the new clone will go outside of the board. Using the representation below, there are no more valid moves because there is either a clone occupying the space above or to the right or the move will cause one clone to go outside of the board.
After the students give up, the mascot will then explain to them that the game was unwinnable and why. Theoretically, the weight outside of the prison must be the same as the weight inside of the prison (which equals 2) in order to win. The weight starts at 1 (in the bottom left corner) and is divided by 2 for the weights in the positions above and to the right. Unfortunately, the only way for the above requirement to be true would be if the board is infinitely large, which is impossible in this game because the board must have specified size.

In the Interest of Full Disclosure:
This game, however, is unwinnable but the students won't be privy to that until they finally decide to give up, which will not be available until they reset the board at least 3 times. There will be a mascot guiding the students along while they play giving them feedback and tips. The mascot will also be playing sounds and playfully taunting the students in an attempt to get them to give up.

The Log:
The log will contain the username, entered in the beginning, and how long the player played the game (from the time they start to the time they give up). To view the log click on the file labeled log.txt. 
