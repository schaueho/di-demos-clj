(ns playitloud.speaker-sig
  (:require [de.find-method.funsig :refer [defimpl]]
            [playitloud.output-sig :refer [blare]]))

(defimpl blare [sound]
  (let [result (str "Speaker plays " sound)]
    (println result)
    result))

