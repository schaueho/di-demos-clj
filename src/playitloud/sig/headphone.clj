(ns playitloud.sig.headphone
  (:require [de.find-method.funsig :refer [defimpl]]
            [playitloud.sig.output-device :refer [blare]]))

(defimpl blare [sound]
  (let [result (str "Headphone plays " sound)]
    (println result)
    result))

