(ns clj-studygroup.core)

(def a-map {:a 1 :b 2})

(def another-map (assoc a-map :c 3))

;what is the value of a-map ?

;what is the value of another-map ?

(defn -main
  "I don't do a whole lot."
  [& args]
  (println "Hello, World!"))
