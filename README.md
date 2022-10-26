# Onbroke

## Setup the project

Clone this repository to a folder that will be referred to as 'repo location' in the following.

From the context menu of the Project Explorer in DIME select 'Import project' or select 'File > Import...' from the main menu.  
In the opening dialog, select 'General > Existing Projects into Workspace' and hit 'Next'.  
In the next dialog, enter your repo location as root directory.  
Mark the checkbox of the `onbroke` project and hit 'Finish'.

Once imported, the project is listed in the Project Explorer. You may want to explore the already existing models in folder `oncore/models`. A good start for your tour is the DAD model in `onbroke/models/app.dad`.

To build and deploy the app, hit the 'Purge and Deploy' button in the Deployment View that builds, deploys and runs the app automatically.
As soon as the app has been deployed you can access it by opening http://localhost:8080 in a browser.
