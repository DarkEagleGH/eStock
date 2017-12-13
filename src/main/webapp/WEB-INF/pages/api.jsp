<div id="content">
    <h2>Simple API how to:</h2>
    <div>
        <ul>
            <li><h3>Entry point</h3>
                <ul>
                    <li><a href="http://localhost:8080/estock/api/">http://localhost:8080/estock/api</a></li>
                </ul>
            </li>
            <li><h3>Root mappings</h3>
                <ul>
                    <li>/item</li>
                    <li>/manufacturer</li>
                    <li>/category</li>
                </ul>
            </li>
            <li><h3>Methods</h3>
                <div class="divTable">
                    <div class="divTableBlock">
                        <div class="divTableRow">
                            <div class="divTableCell"><b>Action</b></div>
                            <div class="divTableCell"><b>Method</b></div>
                            <div class="divTableCell"><b>Key</b></div>
                            <div class="divTableCell"><b>Req body (json)</b></div>
                            <div class="divTableCell"><b>Descr</b></div>
                        </div>
                    </div>
                    <div class="divTableBlock">
                        <div class="divTableRow">
                            <div class="divTableCell">Read</div>
                            <div class="divTableCell">GET</div>
                            <div class="divTableCell">/, /all</div>
                            <div class="divTableCell"></div>
                            <div class="divTableCell">return all records</div>
                        </div>
                        <div class="divTableRow">
                            <div class="divTableCell"></div>
                            <div class="divTableCell">GET</div>
                            <div class="divTableCell">/{id}</div>
                            <div class="divTableCell"></div>
                            <div class="divTableCell">return record id = {id}</div>
                        </div>
                    </div>
                    <div class="divTableBlock">
                        <div class="divTableRow">
                            <div class="divTableCell">Create</div>
                            <div class="divTableCell">POST</div>
                            <div class="divTableCell">/create</div>
                            <div class="divTableCell">{<br>
                                "name": {name},<br>
                                ...<br>
                                }<br>
                            </div>
                            <div class="divTableCell"></div>
                        </div>
                    </div>
                    <div class="divTableBlock">
                        <div class="divTableRow">
                            <div class="divTableCell">Update</div>
                            <div class="divTableCell">PUT</div>
                            <div class="divTableCell">/update</div>
                            <div class="divTableCell">{<br>
                                "id": {id},<br>
                                ...<br>
                                }
                            </div>
                            <div class="divTableCell"></div>
                        </div>
                    </div>
                    <div class="divTableBlock">
                        <div class="divTableRow">
                            <div class="divTableCell">Delete</div>
                            <div class="divTableCell">DELETE</div>
                            <div class="divTableCell">/delete/{id}</div>
                            <div class="divTableCell"></div>
                            <div class="divTableCell"></div>
                        </div>
                        <div class="divTableRow">
                            <div class="divTableCell"></div>
                            <div class="divTableCell">POST</div>
                            <div class="divTableCell">/delete</div>
                            <div class="divTableCell">{<br>
                                ">id": {id},<br>
                                ...<br>
                                }
                            </div>
                            <div class="divTableCell"></div>
                        </div>
                    </div>
                </div>
            </li>
            <li><h3>Objects</h3>
                <ul>
                    <li>
                        Item:
                        <p class="shifted">{ <br>
                            "id": {id},<br>
                            "name": {name},<br>
                            "model": {model},<br>
                            "manufacturerId":{id},<br>
                            "price":{price},<br>
                            "description": {text},<br>
                            "quantity":{qty},<br>
                            "categoryId": {id},<br>
                            }
                        </p>
                    </li>
                    <li>
                        Manufacturer:
                        <p class="shifted">{ <br>
                            "id": {id},<br>
                            "name": {name},<br>
                            }
                        </p>
                    </li>
                    <li>
                        Category:
                        <p class="shifted">{ <br>
                            "id": {id},<br>
                            "parentId" : {id},<br>
                            "name": {name},<br>
                            }
                        </p>
                    </li>
                </ul>
            <li><h3>Examples:</h3>
                <ul>
                    <li>
                        <p class="shifted"><strong>GET</strong>
                            http://localhost:8080/estock/api/manufacturer/<br>
                            - return full list of manufacturers
                        </p>
                    </li>
                    <li>
                        <p class="shifted"><strong>DELETE</strong>
                            http://localhost:8080/estock/api/item/delete/12<br>
                            - delete item with id 12
                        </p>
                    </li>
                    <li>
                        <p class="shifted"><strong>POST</strong>
                            http://localhost:8080/estock/api/category/create <strong>BODY</strong>
                            ({"name":"DVD-players","parentId":"2"})<br>
                            - create new sub category with 2 as parent category
                        </p>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</div>
