package scataz

object toScalaz {
  implicit def toScalazMonad[F[_]](implicit M: cats.Monad[F]): scalaz.Monad[F] =
    new scalaz.Monad[F] {
      def point[A](a: => A): F[A] = M.pure(a)
      def bind[A, B](fa: F[A])(f: A => F[B]): F[B] = M.flatMap(fa)(f)
    }
}
