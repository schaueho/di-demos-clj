(ns playitloud.sig.output-device
  (:require [de.find-method.funsig :refer [defsig]]))

(defsig blare "Play sound loudly!" [sound])
