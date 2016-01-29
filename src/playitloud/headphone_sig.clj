(ns playitloud.headphone-sig
  (:require [de.find-method.funsig :refer [defimpl]]
            [playitloud.output-sig :refer [blare]]))

(defimpl blare [sound]
  (let [result (str "Headphone plays " sound)]
    (println result)
    result))

