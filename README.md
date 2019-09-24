# WheelsUP-Project Automation description.
    a. How to pull project
    b. How to run project 
    c. How to run shall script 

# How to pull Project from Github to eclipse
    Go to Eclipse Upper Left Corner, Click on File then you're able to see a dropdown, 
    click on Import, and a new window will appear.
    Then click on Git folder when extended you will be able to see (Project from git) 
    and Select it Then Click on next, again another window will appear and select clone URL
    displayed URL Window Enter the flowing URL 
    (https://github.com/QA-Alam/WheelsUP-Project/tree/master/WheelsUp_Coding_Challenge) And hit next, 
    select next again and then finish. 
    When installing is finished, you have to do maven life cycle 
    a. Maven Clean 
    b. Maven Install
    c. Maven Update 
    When maven update is completed then under project, you're able to see Sanity.xml file, 
    Also it will be run form CMD, Open CMD simple type (mvn -clean) after clean again type (mvn -install).
    right click on xml file and run as a TestNG then it will run.
    When it is done, you're able to see under project, extend report folder under the folder
    there is another file named (ExtentReportResults.html)
    Right click on this file and open with web browser and you will be able to see report and if test cases
    fail you will be able to see with screen shot report.
    
 # Before pull-up project from Git-Hub, will want to be install some prerequisite tools in our local machine.
     Step 1: Download JDK
     Goto Java SE download site @ http://www.oracle.com/technetwork/java/javase/downloads/index.html.
     Under "Java Platform, Standard Edition" ⇒ "Java SE 1.8.{x}", where {x} denotes a fast running security-update number ⇒ Click the        "Oracle JDK" "Download" button.
     Under "Java SE Development Kit 1.8.{x}" ⇒ Check "Accept License Agreement".
     Choose the JDK for your operating system, i.e., "Windows". Download the "exe" installer (e.g., "jdk-1.8.{x}_windows-x64_bin.exe" -      about 150MB).
     
     Step 2: Include JDK's "bin" Directory in the PATH
     Windows' Command Prompt (CMD) searches the current directory and the directories listed in the PATH environment variable (or system      variable) for executable programs. JDK's programs (such as Java compiler "javac.exe" and Java runtime "java.exe") reside in the          sub-directory "bin" of the JDK installed directory. You need to include JDK's "bin" in the PATH to run the JDK programs.
     To edit the PATH environment variable in Windows 10:
     Launch "Control Panel" ⇒ (Optional) "System and Security" ⇒ "System" ⇒ Click "Advanced system settings" on the left pane.
     Switch to "Advanced" tab ⇒ Click "Environment Variables" button.
     Under "System Variables" (the bottom pane), scroll down to select variable "Path" ⇒ Click "Edit...".
     
     Step 3: Verify the JDK Installation
     Launch a CMD via one of the following means:
     Click "Search" button ⇒ Enter "cmd" ⇒ Choose "Command Prompt", or
     Right-click "Start" button ⇒ run... ⇒ enter "cmd", or
     Click "Start" button ⇒ Windows System ⇒ Command Prompt
     
     (Display the JDK version)
     javac -version
     javac 1.8.1

     (Display the JRE version)
     java -version
     java version "1.8.0" 2018-10-16 LTS
     Java(TM) SE Runtime Environment 18.9
     Java HotSpot(TM) 64-Bit Server VM 18.9, mixed mode).

     To install Apache Maven on Windows, 
     you just need to download the Maven’s zip file, unzip it to a folder, and configure the Windows      environment variables.
     Tested with :
     JDK 1.8
     Maven 3.6
     Windows 10
     Note
     Maven 3.3+ requires JDK 1.7+
     #. JDK and JAVA_HOME
     Make sure JDK is installed, and JAVA_HOME environment variable is configured.
     Check your system to see if you have the 1.8 Java version installed.
     From CMD Command:
     $ java -version
     If you do not have the latest Java installed, find out how to install Java.
    
     #. Download the Eclipse Installer
     Download Eclipse Installer from http://www.eclipse.org/downloads.
     
     Start the Eclipse Installer executable
     For Windows users, after the Eclipse Installer executable has finished downloading it should be available in your download              directory. Start the Eclipse Installer executable. You may get a security warning to run this file. If the Eclipse Foundation is        the Publisher, you are good to select Run.
     
     Select the package to install
     The new Eclipse Installer shows the packages available to Eclipse users. You can search for the package you want to install or          scroll through the list.
     Select and click on the package you want to install.
     
     Select your installation folder
     Specify the folder where you want Eclipse to be installed. The default folder will be in your User directory.
     
     Launch Eclipse
     Once the installation is complete you can now launch Eclipse. The Eclipse Installer has done it's work. Happy coding.
     Setting up Eclipse
     Navigate to the Eclipse download page and download eclipse for Java EE developers.
     Installing TestNG
     Installing a Plugin:
     Inside Eclipse, click on the Help menu
     Select Install New Software.
     Install New Software-1
     Locating the Plugin:
     Click the Add button
     Enter http://beust.com/eclipse in the Location field
     Install New Software-2
     Selecting the Plugin:
     Ensure the TestNG checkbox is selected
     Click the "Next" button to the right bottom
     Install New Software
     Finishing up:
     Accept the terms of the license agreement
     Click on the Finish button.
     
     # How to Run the Project from eclipes:
    From Eclipse
    Import this project into Eclipse
    Right click the project, then select Run as Maven Clean, Maven Install then the tests will start running.
    Following the above steps executes the configurations found in the testing.xml file by default.
    From the Command Line
    Navigate to the location of project then execute mvn clean then mvn install/test.

# Also I placed all the browsers under the project Driver folder:
    So you’re able to run Chrome browser, 
    IE browser, Microsoft Edge, 
    Gecko Driver which is an extension of Firefox Driver 
    and Headless browser. 
    By default it runs on Chrome Browser 
    but if we want to run with another browser so we have to go inside project
    src/main/java folder extend (com.config/Config.properties) then open file under the file change the browser name. 
 # Special Notes:
    Ensure Chrome Browser Latest Version,
    Ensure FF version 48 or higher is installed

# Expected output Report: 
    After successfully running testcases you will be able to see On the Project ExendsReport Folder click on folder                        (ExtentReportResults.html) Right Click on file, Open with Chrome Browser, then you?re able to see extends 
    reports each test cases all    steps verify With Assertions, if it fails Any test cases display Report with screen shot.
    
# If you want to see all the log files:
     Under the project I have a folder with the file log which under there is all log files.
     I’m also using Selenium Page Factory concept for all elements store as an object repository, 
     Utility package for all common utility, Extend Report for Generate Reports with Screen Shots, 
     and either TestNG XML file for running test cases or Bat file. 
     Also, with this Framework you will be able to configure for Virtual Facility project and gradually
     you can implement this with use test cases as well as future test cases. 
     
# Outcome Result inside Console:
    [RemoteTestNG] detected TestNG version 6.14.3
    C:\Users\ynr0fpb\eclipse-workspace\WheelsUp_Coding_Challenge\TestData\WheelsUPData.xlsx
    WorkbookFactory create java.io.FileInputStream@cb51256
    1--------10
    data returning
    INFO [main] (BasePage.java:66)- ******** I am a chrome browser*********
    Starting ChromeDriver 76.0.3809.126 (d80a294506b4c9d18015e755cee48f953ddc3f2f-refs/branch-heads/3809@{#1024}) on port 10586
    Only local connections are allowed.
    Please protect ports used by ChromeDriver and related test frameworks to prevent access by malicious code.
    [1569353561.615][WARNING]: This version of ChromeDriver has not been tested with Chrome version 77.
    Sep 24, 2019 3:32:41 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    INFO [main] (WheelsUpTest.java:53)- ******** Verify & Print Welcome Screen *********
    Verify welcome screen ::A Revolution Has Taken Flight
    INFO [main] (WheelsUpTest.java:63)- ******** Verify & Print Contact Information *********
    Contact Us
    855-FLY-8760
    INFO@WHEELSUP.COM
    INFO [main] (WheelsUpTest.java:70)- ******** Verify & Print Address *********
    Find Us
    220 West 42nd St
    New York, NY 10036
    INFO [main] (WheelsUpTest.java:77)- ******** Verify & click Membership Options *********
    INFO [main] (WheelsUpTest.java:84)- ******** Verify & click Core Member ship *********
    INFO [main] (WheelsUpTest.java:91)- ******** Verify Becoming a Wheels Up Core Member is easy *********
    Becoming a Wheels Up Core Member is easy
    INFO [main] (WheelsUpTest.java:97)- ******** Verify & Print One time initiation fee *********
    ONE-TIME INITIATION FEE
    $17,500
    INFO [main] (WheelsUpTest.java:104)- ******** Verify Learn More Today *********
    INFO [main] (WheelsUpTest.java:110)- ******** Verify & Enter First Name *********
    INFO [main] (WheelsUpTest.java:117)- ******** Verify & Enter Last Name *********
    INFO [main] (WheelsUpTest.java:124)- ******** Click on CONTINUE *********
    INFO [main] (WheelsUpTest.java:131)- ******** Verify Next page and Enter all the Necessary field *********
    INFO [main] (WheelsUpTest.java:138)- ******** Verify HOW MANY PRIVATE FLIGHTS DO YOU TAKE A YEAR? & Click it *********
    INFO [main] (WheelsUpTest.java:144)- ******** Select Year Range *********
    INFO [main] (WheelsUpTest.java:151)- ******** Verify DO YOU HAVE A NEED TO TRAVEL WITH PETS? & Click it *********
    INFO [main] (WheelsUpTest.java:158)- ******** Select Options (PETS) Yes/No *********
    INFO [main] (WheelsUpTest.java:164)- ******** Verify Do you own or travel to a second home? *********
    INFO [main] (WheelsUpTest.java:171)- ******** Verify How do you currently FLY? & Select Jet Card*********
    INFO [main] (WheelsUpTest.java:178)- ******** WHAT MEMBERSHIP TYPE ARE YOU INTERESTED IN? & Select Wheels Up Core Membership*********
    INFO [main] (WheelsUpTest.java:185)- ******** Verify How did you hear about us? & Select Advertisement*********
    INFO [main] (WheelsUpTest.java:191)- ******** Select Advertisement*********
    INFO [main] (WheelsUpTest.java:198)- ******** Enter Please let us know any specific questions you want answered.*********
    INFO [main] (WheelsUpTest.java:205)- ******** Click on X for close window *********
    INFO [main] (WheelsUpTest.java:212)- ******** (Wheels Up Test Success full)*********
    PASSED: WheelsUP_Automation_Coding_Challenge("Mohammed", "Alam", "INFO@WHEELSUP.COM", "855-FLY-8760", "Wheels Up", 
    "220 West 42nd St", "New York", "10036.0", "NY", "United State Of America")

    ===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
    ===============================================
    ===============================================
    Default suite
    Total tests run: 1, Failures: 0, Skips: 0
    ===============================================

# Extra Notes: This project build from scratch using combination of all the below tools & Plugin.

     Java Programming language (OOPs) Concepts.
     Selenium WebDriver    version – 3.11.0
     Maven Build tool      version – 3.6.0
     Eclipse IDE           Version: 2019-03 (4.11.0)
     TestNG                version 6.14.3
     Apache POI            version 3.15
     Extend Report         version 2.41.2
     log 4j                version 1.2.17
     Chrome Driver         version 77.00
     Rest Assured          Version 3.1.0
     Rest Assured          Version 2.8.1
     Json                  Version 20180813
     Jackson-data bind     Version 2.9.8
     Json-simple           Version 1.1.1
     Gson                  Version 2.8.1
  # How to run Shall Script.
  
                     How to run shell script from windows description   
    1. Windows does not have the ability to run bash scripts built in by default. What you will 
    Need to do is install (Cygwin) or something similar to handle execution of bash scripts.
    Once you have (Cygwin) installed you will have access to most unix commands, including myScript.sh.
    {I Creat one file under project file name is a (MyScript.sh) with all the command} 

    However, after install open a (Cygwin) and you can run below                         
                        command  
    2. $ cd
    # Create a folder
    3. $ mkdir myFiles
    # Check a folder
    4. $ ls
    #folder directory
    5. $ cd myFolder
    # Create a 7 txt file 
    6. $ touch file{1..7}.txt
    # Check a file
    7. ls
    # Delete 4 txt file 
    8. $ rm file{1..4}.txt
    # Check how many file are there file
    $ ls
   
    Note:- If you want a write txt, run below command after running open text file and you can write.
    9.  $ start Note pad file1.txt

    Note:- If you want to read file use below command
    10. $ myFolders>type file5.txt 
    
 # Wheels Up Automation Test Exercise user story
      Wheels Up Automation Test Exercise
      Exercise 1 - Create a small bash script (name it myScript.sh)
     - Create a folder (myFiles)
     - Inside the created folder, create 7 files (Eg. file1.txt, file2.txt, file3.txt....)
     - After creating 7 files, delete all files except the last 3 files. (After running the command,
     file5, file6, and file7 must be still there.)
     Exercise 2 - Write an automated test with selenium webdriver Java TestNG based framework for the following scenario. 
     (Use Page Object Model)
    - Navigate to https://wheelsup.com
    - Find and print out in the console the following title “A Revolution Has Taken Flight”
    - Scroll to the bottom, print out phone number, email(Contact Us), and address(Find Us)
    - Scroll to top
    - Header menu, click “MEMBERSHIP OPTIONS” and then “CORE MEMBERSHIP”
    - Scroll to section “Becoming a Wheels Up Core Member is easy”
    - Print out “ONE-TIME INITIATION FEE”
    - Scroll to “Learn more today” section (Enter first and last name)
    - Click continue
    - Enter all the information required to complete the form (DO NOT SUBMIT)
    - Clich “X” at the top right corner
     Exercise 3 - Api testing (use any library or framework)
     - Create a method called “verifySocialAccounts(String twitter, String instagram)”
     - Twitter “https://twitter.com/WheelsUp”
     - Instagram “http://instagram.com/wheelsup8760”
     - Use this point (https://marketingapi.wheelsup.com/api/initial-data/)
     - Get the JSON response and parse it
     - Verify if passed social accounts matches (Use any class assert)
     Note: All 3 exercises must be part of one maven project. Once exercises are completed, 
     upload to your personal Github account. For exercise 2 and 3. Make sure there’s no dependency failures.
     Whe should be able to download it and runnit with no issues.


