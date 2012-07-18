<%-- 
    Document   : register
    Created on : Jun 21, 2012, 9:17:14 AM
    Author     : labuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Register</title>
        </head>
        <body>
            <h1 align="center"><h:outputText value="Welcome to Euro 2012 Lottery Center"/></h1>
            <hr>
            <table width="100%" border="0">
                <tr width="100%">
                    <h:panelGroup>
                        <td width="70%">
                            <table width="100%">
                                <tr>
                                    <td align="center"><h3>All Available Bids</h3></td>
                                </tr>
                                <tr>
                                    <td width="100%">
                                        <table width="100%" border="1">
                                            <tr>
                                                <th>Bid Name</th>
                                                <th>Set by</th>
                                                <th>Set on</th>
                                                <th>Mount</th>
                                                <th>Status</th>
                                            </tr>
                                            <tr>
                                                <td valign="top">Germany vs. Denmark</td>
                                                <td valign="top">Jack Kang</td>
                                                <td valign="top">June 10, 2012</td>
                                                <td valign="top">Germany win: 100<br>Denmark win: 50</td>
                                                <td valign="top">Closed</td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </h:panelGroup>
                    <h:panelGroup rendered="#{!registerBean.loggedin}">
                        <td width="20px"/>
                        <td>
                            <h:form>
                                <table>
                                    <tr>
                                        <td>Email:</td>
                                        <td><h:inputText id="email" value="#{registerBean.email}"/></td>
                                    </tr>
                                    <tr>
                                        <td>Password: </td>
                                        <td><h:inputSecret id="pwd" value="#{registerBean.pwd}"/></td>
                                    </tr>
                                    <tr>
                                        <td rowspan="2">
                                            <h:commandButton action="#{registerBean.register}" value="Login"/>
                                            &nbsp;&nbsp;&nbsp;<a href="register.jsp">Register</a>
                                            <h:commandLink action="#{registerBean.register}" value="Login"/>
                                    </tr>
                                </table>

                            </h:form>
                        </td>
                    </h:panelGroup>
                    <h:panelGroup rendered="#{registerBean.loggedin}">
                        <td width="20px"/>
                        <td>
                            <h:form>
                                <h:selectOneMenu>
                                    <f:selectItems value="#{registerBean.options}"/>
                                </h:selectOneMenu>
                                <br>
                                <h:commandButton value="Logout" action="#{registerBean.logout}"/>
                            </h:form>
                        </td>
                    </h:panelGroup>
                </tr>
            </table>
            
        </body>
    </html>
</f:view>

