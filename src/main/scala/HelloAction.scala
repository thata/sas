package com.example.sample.sas.action

import org.seasar.struts.annotation.Execute

class HelloAction
{
    @Execute(validator = false)
    def index = "index.jsp"
}
