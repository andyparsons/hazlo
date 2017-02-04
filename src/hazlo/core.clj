(ns hazlo.core
  (:require [immutant.web :as web])
  (:gen-class))

(defn app [request]
  {:status 200
   :body "Welcome to Hazlo!"})

(defn -main []
  (web/run app))
