(ns detect.core
  (:require [clojure.string :as str]))

(defn most-frequent-word [text]
  (let [words (str/split (str/lower-case text) #"\W+")
        freq-map (frequencies words)
        most-frequent (apply max-key val freq-map)]
    (println "✨ The most frequent word is ✨")
    (println "==========================")
    (println "🌟" (key most-frequent) "🌟")
    (println "==========================")))

(defn -main [& args]
  (most-frequent-word "Your sample text goes here. This is just a sample text for demonstration. This text will have a most frequent word."))
