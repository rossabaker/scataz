# Scataz

An experimental bridge from Scalaz type classes to Cats, and back.

```scala
scala> implicitly[cats.Monad[scalaz.Maybe]]
<console>:8: error: could not find implicit value for parameter e: cats.Monad[scalaz.Maybe]
              implicitly[cats.Monad[scalaz.Maybe]]

scala> import scataz.toCats._
import scataz.toCats._

scala> implicitly[cats.Monad[scalaz.Maybe]]
res3: cats.Monad[scalaz.Maybe] = scataz.toCats$$anon$1@cb01da9
```
