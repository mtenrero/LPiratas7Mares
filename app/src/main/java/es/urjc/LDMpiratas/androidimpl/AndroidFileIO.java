package es.urjc.LDMpiratas.androidimpl;

/**
 * Created by liliana.santacruz on 14/11/2016.
 */

import android.content.res.AssetManager;
import android.os.Environment;
import es.urjc.LDMpiratas.liliana.core.FileIO;

import java.io.*;

public class AndroidFileIO implements FileIO {
    AssetManager assets;
    String rutaAlmacenamientoExterno;

    public AndroidFileIO(AssetManager assets) {
        this.assets = assets;
        this.rutaAlmacenamientoExterno = Environment
                .getExternalStorageDirectory().getAbsolutePath()
                + File.separator;
    }

    @Override
    public InputStream leerAsset(String nombreArchivo) throws IOException {
        return assets.open(nombreArchivo);
    }

    @Override
    public InputStream leerArchivo(String nombreArchivo) throws IOException {
        return new FileInputStream(rutaAlmacenamientoExterno + nombreArchivo);
    }

    @Override
    public OutputStream escribirArchivo(String nombreArchivo) throws IOException {
        return new FileOutputStream(rutaAlmacenamientoExterno + nombreArchivo);
    }

}









