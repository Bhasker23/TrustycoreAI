# TrustyCore :heart_eyes:

<h2>Description</h2>
This is a simple git Repo that demonstrates how to get started with TrustyAI.
<h2>Installation :desktop_computer: </h2>

### Prerequisites :
  You will need 🛠️ - 

 * Git - 2.27.0 .
 * Docker - 20.10.3 .
 * Docker-compose - 1.25.2 .
 * Java - 11 :coffee:
 * Maven - 3.6.3

Just so you know, also previous versions of the applications might work, but they were not tested.

### Steps to complete setup 📋🖋️ :

  1. clone the kogito-examples Repository   :octocat:.
        
     `git clone https://github.com/kiegroup/kogito-examples.git`

  2.  Check out the stable branch.

      `cd kogito-examples`  
       `git checkout stable`


## Compile and package in Local Dev Mode :electric_plug: :

  Build a new kogito decision service with the tracing-addon and the monitoring-addon. or you can compile and package already prepared service at.
  
  **Before building jar check for the embedded Maven version if you using any IDE.**  
  
  `mvn clean package -DskipTests -f dmn-tracing-quarkus/pom.xml`

### On successfully jar building :

Change the directory to -
`dmn-tracing-quarkus`


## Build :bricks: the Docker Image

Give this command to your cmd at the present directory.  

`docker build -t <your_namespace>/dmn-tracing-quarkus:1.0 dmn-tracing-quarkus/`

Now the docker image will be built.

## Run :running_man: the Kogito service together with the TrustyAI infrastructure :office:.

In order to do that, change your current directory to  

`kogito-examples/kogito-quarkus-examples/trusty-demontration/docker-compose`

With your preferred editor, edit the file docker-compose.yaml and replace the line 48 with the tag of the docker image you have just created.

![Screenshot-from-2021-03-09-17-01-47-1-768x230](https://github.com/Bhasker23/TrustyCore/assets/101566187/17a1bbfc-eea4-49fa-b629-e365f5533d43)


## Run :running_man: the docker-compose command   
`docker-compose up`
# TrustyAI
