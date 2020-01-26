# sbt-dependency-graph-sugar [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.gfccollective/sbt-dependency-graph-sugar/badge.svg?style=plastic)](https://maven-badges.herokuapp.com/maven-central/org.gfccollective/sbt-dependency-graph-sugar) [![Build Status](https://github.com/gfc-collective/sbt-dependency-graph-sugar/workflows/Scala%20CI/badge.svg)](https://github.com/gfc-collective/sbt-dependency-graph-sugar/actions) [![Coverage Status](https://coveralls.io/repos/gfc-collective/sbt-dependency-graph-sugar/badge.svg?branch=master&service=github)](https://coveralls.io/github/gfc-collective/sbt-dependency-graph-sugar?branch=master)

We’ve come to love [sbt-dependency-graph](https://github.com/jrudolph/sbt-dependency-graph), but have been frustrated with the ascii output, and found the other outputs not straightforward to use.
This sbt plugin provides some “sugar” that makes life a bit nicer when you are running on a machine with [GraphViz](http://www.graphviz.org/) installed.
A fork and new home of the unmaintained Gilt sbt plugin, now under the [GFC Collective](https://github.com/gfc-collective) umbrella, maintained by some of the original authors.

### Installation

Its version is taken from sbt-dependency-graph (current version is 0.9.2), and if you include this plugin, you are pulling in sbt-dependency-graph automatically.

Enable the plugin with the following configurgation:
```scala
addSbtPlugin("org.gfccollective" % "sbt-dependency-graph-sugar" % "0.9.2")
```

Instead of putting this in your project’s ``project/plugins.sbt`` file, we recommend putting it once in your ``~/.sbt/0.13/plugins/sbt-dependency-graph-sugar.sbt`` file, so that it is available in all your apps and managed in the “per-machine plane” instead of per application. This way you can customize the command to view the svg to work always on a given machine.

### Usage

`dependencySvg` creates a svg file into the target directory of the project

`dependencySvgView` views the svg file in a browser

By default, the svg file is opened using the command ``open -a Safari [path-to-svg]``. This should work well on a default Mac. You can change this behaviour by creating a file, ``~/.sbt/gilt/sbt-dependency-graph-sugar-cmd`` that holds a replacement command. The plugin will try to find the first line of the file that it can parse as a command, and it should have the token ``$1`` where the path to the svg file should go.  Example:

	$ cat ~/.sbt/gilt/sbt-dependency-graph-sugar-cmd
	open -a Google\ Chrome $1

The output format can be changed by setting the `dependencyGraphOutputFormat` key:

```scala
  dependencyGraphOutputFormat in Compile := "png"
```

This must include a configuration. There is a helper to modify the keys for all configs:

`gilt.DependencyGraph.inConfigs(dependencyGraphOutputFormat := "png")`

You can obviously put whatever command works on your particular OS, and as long as the `scala.sys.process._` machinery can run it, it should work fine.

### Credits

Many thanks to Johannes Rudolph for the sbt-dependency-graph plugin, and Andrey Kartashov for the original concept and implementation in our internal build plugin.
