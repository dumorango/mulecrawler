import groovy.xml.*
import groovy.xml.dom.*

println payload

def xmlDom = DOMBuilder.newInstance().parseText(payload) 