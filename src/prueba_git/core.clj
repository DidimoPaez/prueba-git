(ns prueba-git.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
(defn fibonacci [n]
  (if (< n 2)
    1
    (* (fibonacci (n - 1)) (fibonacci (n - 1)))))