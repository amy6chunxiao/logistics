$(function(){
    $.ajax({
        type:"post",
        url:"./logisticDynamic/getAll.action",
        dataType:"json"
    }).success(function(res){
        var $tbody = $('.table tbody').eq(0),
            fragment = document.createDocumentFragment(),
            i = 0,
            len = res.length;
        for( ; i<len ; i++){
            var tr = document.createElement('tr'),
                opTd = document.createElement('td'),
                id='';

            for(var j in res[i]){
                if(j === 'content') continue;
                if(j === 'id') id = res[i][j];
                var td = document.createElement('td');
                td.innerHTML = res[i][j];
                tr.appendChild(td);
            }

            opTd.innerHTML = '<a href="./manager/active_show.jsp?id='+id+'">修改</a> | <a href="./logisticDynamic/delete.action?id='+id+'">删除</a>';
            tr.appendChild(opTd);
            fragment.appendChild(tr);
        }
        $tbody.append(fragment);
    })
})