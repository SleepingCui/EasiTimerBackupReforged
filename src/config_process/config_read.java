package config_process;
import java.io.*;
import config_process.config_write;
public class config_read {
    private static String rcfg(int lineToRead, String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {
                if (lineNumber == lineToRead) {
                    return line;
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }

    public static String get_config(String target) {
        config_write.IsFileEsixt();
        String config_file_path = "config.cfg";
        if (target == "time_hour") {
            String readed_data = rcfg(17, config_file_path);
            return readed_data;
        }
        else if (target == "time_minute") {
            String readed_data = rcfg(18, config_file_path);
            return readed_data;
        }
        else if (target == "time_second") {
            String readed_data = rcfg(19, config_file_path);
            return readed_data;
        }
        else if (target == "source_dir") {
            String readed_data = rcfg(32, config_file_path);
            return readed_data;
        }
        else if (target == "temp_dir") {
            String readed_data = rcfg(33, config_file_path);
            return readed_data;
        }
        else if (target == "backup_dir") {
            String readed_data = rcfg(34, config_file_path);
            return readed_data;
        }
        else {
            return null;
        }

    }


}
