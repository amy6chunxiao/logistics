require.config({
    baseUrl:'../',
    paths: {
        jquery: 'components/jquery/jquery',
        index:'js/index'
    }
});


require(['index'],function(index){
    index();
})