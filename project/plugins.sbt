addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.13")

libraryDependencies += "org.gfccollective" %% "gfc-semver" % "1.0.0"

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.8.1")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.1")

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
