<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Entity.Usuarios"%>
<%@page import="DAO.UsuariosDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <form action="UsuariosController">
            <input type="text" name="Nome">
            <input type="text" name="Peso">
            <input type="number" name="Idade">
            <input type="submit" value="Salvar" name="accion">
        </form>
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nome</th>
                    <th>Peso</th>
                    <th>Idade</th>
                </tr>
            </thead>
            <%
                UsuariosDAO dao = new UsuariosDAO();
               List<Usuarios> lista = dao.getAll();
               Iterator<Usuarios> iter = lista.iterator();
               Usuarios u = null;
               while(iter.hasNext()){
               u = iter.next();
            %>
            <tbody>
                <tr>
                    <td><%= u.getId()%></td>
                     <td><%= u.getNome()%></td>
                      <td><%= u.getPeso()%></td>
                       <td><%= u.getIdade()%></td>
                       <td>
                           <a href="UsuariosController?accion=remover&id=<%= u.getId()%>">Deletar</a>
                       </td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>        
    </body>
</html>
