package scataz

object toCats {
  implicit def toCatsMonad[F[_]](implicit M: scalaz.Monad[F]): cats.Monad[F] =
    new cats.Monad[F] {
      def pure[A](x: A): F[A] = M.pure(x)
      def flatMap[A, B](fa: F[A])(f: A => F[B]): F[B] = M.bind(fa)(f)
    }
}
