libraryDependencies += "com.gilt" %% "gfc-semver" % "0.0.5"

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.0")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
