(ns playitloud.sig.speaker
  (:require [de.find-method.funsig :refer [defimpl]]
            [playitloud.sig.output-device :refer [blare]]))

(defimpl blare [sound]
  (let [result (str "Speaker plays " sound)]
    (println result)
    result))

