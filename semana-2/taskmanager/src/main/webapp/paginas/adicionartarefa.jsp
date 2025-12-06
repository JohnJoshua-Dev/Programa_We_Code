<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestor de Tarefas</title>
    <link rel="stylesheet" type="text/css" href="../css/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
        crossorigin="anonymous"></script>
</head>

<body>

    <header class="Header">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-2">
                    <div class="row">
                        <div class="col-md-12 text-center">
                            <img src="../imgs/3d-render-todo-check-list-with-ticks-task-test.jpg" alt="Logo" class="img-fluid logo mt-4 mb-4">
                        </div>
                    </div>
                    <h2 class=""></h2>
                    <jsp:include page="menu.jsp" />
</div>
                <div class="col-md-10 ">
                    <div class="row">
                        <div class="col-md-12">
                            <h1 class="">Bem-<span class="title">vindo</span> ao Gestor de <span class="title">Tarefas</span>
                            </h1>
                        </div>

                    </div>
                    <div class="row-main">
                        <div class="col main-content">
                            
                            
                            <div class="row justify-content-center align-items-center h-100">
                                <div class="row">
                                    <div class="col text-center flex-column">
                                        <div class="cardTask">
                                        <h3 class="text-center titlecard">Adicionar Tarefa</h3>

                                        <form class="" action="${pageContext.request.contextPath}/hello" method="POST">
                                            <div class="mb-3">
                                                <label for="tarefa" class="form-label"></label>
                                                <input type="text" name="tarefa" class="form-control" id="tarefa" placeholder="Digite a tarefa">
                                            </div>
                                            <div class="mb-3">
                                                <label for="descricao" class="form-label"></label>
                                                <textarea class="form-control" name="descricao" id="descricao" rows="3" placeholder="Digite a descrição da tarefa"></textarea>
                                            </div>
                                            <button type="submit" class="btn btn-primary">Adicionar</button>
                                        </form>
                                        </div>
                                    </div>
                                </div>
                                <div class="col justify-content-center d-flex align-items-center">
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>

</body>

</html>