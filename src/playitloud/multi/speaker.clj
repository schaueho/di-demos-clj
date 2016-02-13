(ns playitloud.multi.speaker
  (:require [playitloud.multi.output-device :refer [blare]]))

(defmethod blare :speaker [device song]
  (let [result (str "Speaker plays " song)]
    (println result)
    result))

