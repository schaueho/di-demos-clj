# playitloud

Demo code for a presentation on [dependency inversion / management in Clojure](www.find-method.de/resources/docs/dependency-management-clojured/).

## Usage

This code isn't meant to be used, it's only demo code for multiple ways on how to manage dependencies in Clojure.

You can run the tests with a simple `lein midje`.

## Code layout

The top-level directory holds the most basic version of the demo code (no dependency management).
The subdirectories then hold code for the different approaches:

- [higher order functions](src/playitloud/ho)
- [protocols](src/playitloud/proto)
- [multimethods](src/playitloud/multi)
- [service locator](src/playitloud/services)
- [funsig](src/playitloud/sig)
- [clj-di](src/playitloud/di)
- [dynamic variables](src/playitloud/dynvar)
- [component](src/playitloud/comp)
- [mount](src/playitloud/mount)

## License

Copyright © 2016 Holger Schauer <holger.schauer@gmx.de>

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
