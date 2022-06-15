using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

/// <summary>
/// Descripción breve de WebService
/// </summary>
[WebService(Namespace = "http://tempuri.org/")]
[WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
// Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
// [System.Web.Script.Services.ScriptService]
public class WebService : System.Web.Services.WebService
{

    public WebService()
    {

        //Elimine la marca de comentario de la línea siguiente si utiliza los componentes diseñados 
        //InitializeComponent(); 
    }

    [WebMethod]
    public string fibo_estructurado(int n)
    {
        string y = "";
        for (int i = 0; i < n; i++)
            y = y + Ejercicio4FSharp.Funcion_fibo.fibo(i) + " ";
        return y;
    }

    [WebMethod]
    public string fibo_recursivo(int n)
    {
        string y = "";
        for (int i = 0; i < n; i++)
            y = y + Ejercicio4FSharp.Funcion_fibo.fibo_rec(i) + " ";
        return y;
    }

}
