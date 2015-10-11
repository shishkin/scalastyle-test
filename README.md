IntelliJ [Scala plugin](http://plugins.jetbrains.com/plugin/?idea&id=1347) code inspection 
supports [Scalastyle](http://www.scalastyle.org/) rules, but expects the config file in a rather 
odd place (`./project/scalastyle_config.xml` instead of the default `./scalastyle-config.xml`). 
This requires overriding `scalastyleConfig`, which is 
[broken](https://github.com/scalastyle/scalastyle-sbt-plugin/issues/44) in `Test` configuration. 
This repository demonstrates how to make it work in `Compile` and `Test` configuration in a 
multi-module project. Based on this suggestion: 
https://github.com/scalastyle/scalastyle-sbt-plugin/issues/42#issuecomment-143108080.
