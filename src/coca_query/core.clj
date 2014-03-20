(ns coca_query.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))



(use 'clj-webdriver.taxi)

(def url  "http://www.wordandphrase.info/frequencyList.asp")
(set-driver! {:browser :firefox} url)

(def ch "a")

(login and input a*)

(switch-to-frame (find-element {:xpath "//html/frameset/frameset[@id='topFrame']/frame[@id='righto']"})
)


(refresh)
(switch-to-frame  (find-element {:xpath "//html/frameset/frameset[@id='topFrame']/frame[@name='lefto']"}))
(input-text "#w1" (str ch "*"))
(click (find-element {:tag :input, :value "SEARCH"}))






(def morehits (find-element {:tag :a, :text "MORE HITS"}))
(if morehits (click morehits ))

(let [source (page-source)
        t (html/select source [:table#datatable])
       ]
    (pprint t)
    )


(defn click-more-hits []
    (let [morehits (find-element {:tag :a, :text "MORE HITS"})]
      (if morehits (do (click morehits) true) false)))
          
(defn get-table-text []
    (let [t (text (find-element {:tag :table, :border "1"}))]
      t))

(defn store-to-file [t]
     (spit (str "/tmp/" ch ".txt") (str t "\n") :append true))

(defn process []
     (store-to-file  get-table-text)
      (if click-more-hits recur))
