addSbtPlugin("com.github.sbt" % "sbt-release" % "1.0.15")

libraryDependencies += "org.gfccollective" %% "gfc-semver" % "1.0.0"

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.5")

addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.1.2")

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value

addSbtPlugin("org.scoverage" %% "sbt-scoverage" % "1.8.2")

addSbtPlugin("org.scoverage" %% "sbt-coveralls" % "1.2.7")
