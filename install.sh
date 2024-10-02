wget https://ci.opencollab.dev/job/NukkitX/job/Nukkit/job/master/lastSuccessfulBuild/artifact/target/nukkit-1.0-SNAPSHOT.jar
mvn install:install-file \                                                             -Dfile=/opt/admin2/java/projects/nukkit-1.0-SNAPSHOT.jar \
  -DgroupId=cn.nukkit \
  -DartifactId=nukkit \
  -Dversion=1.0-SNAPSHOT \
  -Dpackaging=jar