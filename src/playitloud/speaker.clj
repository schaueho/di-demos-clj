(ns playitloud.speaker)

(defn blare [song]
  (let [result (str "Speaker plays " song)]
    (println result)
    result))
