(ns playitloud.headphone)

(defn blare [noise]
  (let [result (str "Headphone plays " noise)]
    (println result)
    result))
