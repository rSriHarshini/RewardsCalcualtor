# Base Image
FROM openjdk:11
LABEL maintainer="Sri Harshini"
ADD build/libs/dockerImage_rewardPoints-0.0.1-SNAPSHOT.jar harshini-rewards-calculator.jar
ENTRYPOINT [ "java","-jar", "harshini-rewards-calculator.jar" ]
