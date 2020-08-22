
libraryDependencies += {
  def sbtDependencyGraphVersion(sugarVersion: String) = {
    val semVer = org.gfccollective.semver.SemVer(sugarVersion)
    s"${semVer.major}.${semVer.minor}.${semVer.point}"
  }
  sbt.Defaults.sbtPluginExtra("net.virtual-void" % "sbt-dependency-graph" % sbtDependencyGraphVersion(version.value), (sbtBinaryVersion in pluginCrossBuild).value, (scalaBinaryVersion in pluginCrossBuild).value)
}

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % "test"

scalacOptions ++= Seq("-deprecation", "-unchecked")

scriptedBufferLog := false
