(ns playitloud.speaker-multi
  (:require [playitloud.output-multi :refer [blare]]))

(defmethod blare :speaker [device song]
  (let [result (str "Speaker plays " song)]
    (println result)
    result))

