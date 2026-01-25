INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'aa', 'aar', 'aar', 'Hamitic', 'Afar', '6301'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'aa' AND lang_code3b = 'aar' AND lang_code3t = 'aar' AND lang_family = 'Hamitic' AND lang_name = 'Afar' AND standard_language_id = '6301');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ab', 'abk', 'abk', 'Ibero-caucasian', 'Abkhazian', '6302'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ab' AND lang_code3b = 'abk' AND lang_code3t = 'abk' AND lang_family = 'Ibero-caucasian' AND lang_name = 'Abkhazian' AND standard_language_id = '6302');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ace', 'ace', 'Achinese', '6303'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ace' AND lang_code3t = 'ace' AND lang_name = 'Achinese' AND standard_language_id = '6303');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ach', 'ach', 'Acoli', '6304'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ach' AND lang_code3t = 'ach' AND lang_name = 'Acoli' AND standard_language_id = '6304');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ada', 'ada', 'Adangme', '6305'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ada' AND lang_code3t = 'ada' AND lang_name = 'Adangme' AND standard_language_id = '6305');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'afa', 'afa', 'Afro-Asiatic (Other)', '6306'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'afa' AND lang_code3t = 'afa' AND lang_name = 'Afro-Asiatic (Other)' AND standard_language_id = '6306');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'afh', 'afh', 'Afrihili', '6307'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'afh' AND lang_code3t = 'afh' AND lang_name = 'Afrihili' AND standard_language_id = '6307');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'af', 'afr', 'afr', 'Germanic', 'Afrikaans', '6308'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'af' AND lang_code3b = 'afr' AND lang_code3t = 'afr' AND lang_family = 'Germanic' AND lang_name = 'Afrikaans' AND standard_language_id = '6308');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'aka', 'aka', 'Akan', '6309'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'aka' AND lang_code3t = 'aka' AND lang_name = 'Akan' AND standard_language_id = '6309');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'akk', 'akk', 'Akkadian', '6310'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'akk' AND lang_code3t = 'akk' AND lang_name = 'Akkadian' AND standard_language_id = '6310');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ale', 'ale', 'Aleut', '6311'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ale' AND lang_code3t = 'ale' AND lang_name = 'Aleut' AND standard_language_id = '6311');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'alg', 'alg', 'Algonquian languages', '6312'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'alg' AND lang_code3t = 'alg' AND lang_name = 'Algonquian languages' AND standard_language_id = '6312');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'am', 'amh', 'amh', 'Semitic', 'Amharic', '6313'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'am' AND lang_code3b = 'amh' AND lang_code3t = 'amh' AND lang_family = 'Semitic' AND lang_name = 'Amharic' AND standard_language_id = '6313');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ang', 'ang', 'English, Old (ca. 450-1100)', '6314'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ang' AND lang_code3t = 'ang' AND lang_name = 'English, Old (ca. 450-1100)' AND standard_language_id = '6314');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'apa', 'apa', 'Apache languages', '6315'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'apa' AND lang_code3t = 'apa' AND lang_name = 'Apache languages' AND standard_language_id = '6315');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ar', 'ara', 'ara', 'Semitic', 'Arabic', '6316'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ar' AND lang_code3b = 'ara' AND lang_code3t = 'ara' AND lang_family = 'Semitic' AND lang_name = 'Arabic' AND standard_language_id = '6316');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'arc', 'arc', 'Aramaic', '6317'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'arc' AND lang_code3t = 'arc' AND lang_name = 'Aramaic' AND standard_language_id = '6317');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'arn', 'arn', 'Araucanian', '6318'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'arn' AND lang_code3t = 'arn' AND lang_name = 'Araucanian' AND standard_language_id = '6318');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'arp', 'arp', 'Arapaho', '6319'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'arp' AND lang_code3t = 'arp' AND lang_name = 'Arapaho' AND standard_language_id = '6319');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'art', 'art', 'Artificial (Other)', '6320'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'art' AND lang_code3t = 'art' AND lang_name = 'Artificial (Other)' AND standard_language_id = '6320');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'arw', 'arw', 'Arawak', '6321'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'arw' AND lang_code3t = 'arw' AND lang_name = 'Arawak' AND standard_language_id = '6321');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'as', 'asm', 'asm', 'Indian', 'Assamese', '6322'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'as' AND lang_code3b = 'asm' AND lang_code3t = 'asm' AND lang_family = 'Indian' AND lang_name = 'Assamese' AND standard_language_id = '6322');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ath', 'ath', 'Athapascan languages', '6323'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ath' AND lang_code3t = 'ath' AND lang_name = 'Athapascan languages' AND standard_language_id = '6323');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'aus', 'aus', 'Australian languages', '6324'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'aus' AND lang_code3t = 'aus' AND lang_name = 'Australian languages' AND standard_language_id = '6324');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ava', 'ava', 'Avaric', '6325'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ava' AND lang_code3t = 'ava' AND lang_name = 'Avaric' AND standard_language_id = '6325');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ae', 'ave', 'ave', 'Avestan', '6326'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ae' AND lang_code3b = 'ave' AND lang_code3t = 'ave' AND lang_name = 'Avestan' AND standard_language_id = '6326');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'awa', 'awa', 'Awadhi', '6327'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'awa' AND lang_code3t = 'awa' AND lang_name = 'Awadhi' AND standard_language_id = '6327');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ay', 'aym', 'aym', 'Amerindian', 'Aymara', '6328'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ay' AND lang_code3b = 'aym' AND lang_code3t = 'aym' AND lang_family = 'Amerindian' AND lang_name = 'Aymara' AND standard_language_id = '6328');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'az', 'aze', 'aze', 'Turkic/altaic', 'Azerbaijani', '6329'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'az' AND lang_code3b = 'aze' AND lang_code3t = 'aze' AND lang_family = 'Turkic/altaic' AND lang_name = 'Azerbaijani' AND standard_language_id = '6329');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bad', 'bad', 'Banda', '6330'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'bad' AND lang_code3t = 'bad' AND lang_name = 'Banda' AND standard_language_id = '6330');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bai', 'bai', 'Bamileke languages', '6331'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'bai' AND lang_code3t = 'bai' AND lang_name = 'Bamileke languages' AND standard_language_id = '6331');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ba', 'bak', 'bak', 'Turkic/altaic', 'Bashkir', '6332'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ba' AND lang_code3b = 'bak' AND lang_code3t = 'bak' AND lang_family = 'Turkic/altaic' AND lang_name = 'Bashkir' AND standard_language_id = '6332');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bal', 'bal', 'Baluchi', '6333'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'bal' AND lang_code3t = 'bal' AND lang_name = 'Baluchi' AND standard_language_id = '6333');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bam', 'bam', 'Bambara', '6334'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'bam' AND lang_code3t = 'bam' AND lang_name = 'Bambara' AND standard_language_id = '6334');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ban', 'ban', 'Balinese', '6335'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ban' AND lang_code3t = 'ban' AND lang_name = 'Balinese' AND standard_language_id = '6335');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bas', 'bas', 'Basa', '6336'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'bas' AND lang_code3t = 'bas' AND lang_name = 'Basa' AND standard_language_id = '6336');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bat', 'bat', 'Baltic (Other)', '6337'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'bat' AND lang_code3t = 'bat' AND lang_name = 'Baltic (Other)' AND standard_language_id = '6337');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bej', 'bej', 'Beja', '6338'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'bej' AND lang_code3t = 'bej' AND lang_name = 'Beja' AND standard_language_id = '6338');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'be', 'bel', 'bel', 'Slavic', 'Belarusian', '6339'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'be' AND lang_code3b = 'bel' AND lang_code3t = 'bel' AND lang_family = 'Slavic' AND lang_name = 'Belarusian' AND standard_language_id = '6339');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bem', 'bem', 'Bemba', '6340'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'bem' AND lang_code3t = 'bem' AND lang_name = 'Bemba' AND standard_language_id = '6340');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'bn', 'ben', 'ben', 'Indian', 'Bengali', '6341'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'bn' AND lang_code3b = 'ben' AND lang_code3t = 'ben' AND lang_family = 'Indian' AND lang_name = 'Bengali' AND standard_language_id = '6341');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ber', 'ber', 'Berber (Other)', '6342'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ber' AND lang_code3t = 'ber' AND lang_name = 'Berber (Other)' AND standard_language_id = '6342');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bho', 'bho', 'Bhojpuri', '6343'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'bho' AND lang_code3t = 'bho' AND lang_name = 'Bhojpuri' AND standard_language_id = '6343');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'bh', 'bih', 'bih', 'Indian', 'Bihari', '6344'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'bh' AND lang_code3b = 'bih' AND lang_code3t = 'bih' AND lang_family = 'Indian' AND lang_name = 'Bihari' AND standard_language_id = '6344');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bik', 'bik', 'Bikol', '6345'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'bik' AND lang_code3t = 'bik' AND lang_name = 'Bikol' AND standard_language_id = '6345');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bin', 'bin', 'Bini', '6346'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'bin' AND lang_code3t = 'bin' AND lang_name = 'Bini' AND standard_language_id = '6346');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bi', 'bis', 'bis', 'Bislama', '6347'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'bi' AND lang_code3b = 'bis' AND lang_code3t = 'bis' AND lang_name = 'Bislama' AND standard_language_id = '6347');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bla', 'bla', 'Siksika', '6348'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'bla' AND lang_code3t = 'bla' AND lang_name = 'Siksika' AND standard_language_id = '6348');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bnt', 'bnt', 'Bantu (Other)', '6349'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'bnt' AND lang_code3t = 'bnt' AND lang_name = 'Bantu (Other)' AND standard_language_id = '6349');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'bo', 'tib', 'bod', 'Asian', 'Tibetan', '6350'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'bo' AND lang_code3b = 'tib' AND lang_code3t = 'bod' AND lang_family = 'Asian' AND lang_name = 'Tibetan' AND standard_language_id = '6350');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bs', 'bos', 'bos', 'Bosnian', '6351'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'bs' AND lang_code3b = 'bos' AND lang_code3t = 'bos' AND lang_name = 'Bosnian' AND standard_language_id = '6351');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bra', 'bra', 'Braj', '6352'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'bra' AND lang_code3t = 'bra' AND lang_name = 'Braj' AND standard_language_id = '6352');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'br', 'bre', 'bre', 'Celtic', 'Breton', '6353'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'br' AND lang_code3b = 'bre' AND lang_code3t = 'bre' AND lang_family = 'Celtic' AND lang_name = 'Breton' AND standard_language_id = '6353');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'btk', 'btk', 'Batak (Indonesia)', '6354'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'btk' AND lang_code3t = 'btk' AND lang_name = 'Batak (Indonesia)' AND standard_language_id = '6354');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bua', 'bua', 'Buriat', '6355'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'bua' AND lang_code3t = 'bua' AND lang_name = 'Buriat' AND standard_language_id = '6355');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'bug', 'bug', 'Buginese', '6356'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'bug' AND lang_code3t = 'bug' AND lang_name = 'Buginese' AND standard_language_id = '6356');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'bg', 'bul', 'bul', 'Slavic', 'Bulgarian', '6357'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'bg' AND lang_code3b = 'bul' AND lang_code3t = 'bul' AND lang_family = 'Slavic' AND lang_name = 'Bulgarian' AND standard_language_id = '6357');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'cad', 'cad', 'Caddo', '6358'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'cad' AND lang_code3t = 'cad' AND lang_name = 'Caddo' AND standard_language_id = '6358');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'cai', 'cai', 'Central American Indian (Other)', '6359'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'cai' AND lang_code3t = 'cai' AND lang_name = 'Central American Indian (Other)' AND standard_language_id = '6359');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'car', 'car', 'Carib', '6360'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'car' AND lang_code3t = 'car' AND lang_name = 'Carib' AND standard_language_id = '6360');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ca', 'cat', 'cat', 'Romance', 'Catalan', '6361'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ca' AND lang_code3b = 'cat' AND lang_code3t = 'cat' AND lang_family = 'Romance' AND lang_name = 'Catalan' AND standard_language_id = '6361');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'cau', 'cau', 'Caucasian (Other)', '6362'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'cau' AND lang_code3t = 'cau' AND lang_name = 'Caucasian (Other)' AND standard_language_id = '6362');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ceb', 'ceb', 'Cebuano', '6363'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ceb' AND lang_code3t = 'ceb' AND lang_name = 'Cebuano' AND standard_language_id = '6363');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'cel', 'cel', 'Celtic (Other)', '6364'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'cel' AND lang_code3t = 'cel' AND lang_name = 'Celtic (Other)' AND standard_language_id = '6364');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'cs', 'cze', 'ces', 'Slavic', 'Czech', '6365'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'cs' AND lang_code3b = 'cze' AND lang_code3t = 'ces' AND lang_family = 'Slavic' AND lang_name = 'Czech' AND standard_language_id = '6365');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ch', 'cha', 'cha', 'Chamorro', '6366'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ch' AND lang_code3b = 'cha' AND lang_code3t = 'cha' AND lang_name = 'Chamorro' AND standard_language_id = '6366');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'chb', 'chb', 'Chibcha', '6367'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'chb' AND lang_code3t = 'chb' AND lang_name = 'Chibcha' AND standard_language_id = '6367');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ce', 'che', 'che', 'Chechen', '6368'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ce' AND lang_code3b = 'che' AND lang_code3t = 'che' AND lang_name = 'Chechen' AND standard_language_id = '6368');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'chg', 'chg', 'Chagatai', '6369'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'chg' AND lang_code3t = 'chg' AND lang_name = 'Chagatai' AND standard_language_id = '6369');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'chk', 'chk', 'Chuukese', '6370'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'chk' AND lang_code3t = 'chk' AND lang_name = 'Chuukese' AND standard_language_id = '6370');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'chm', 'chm', 'Mari', '6371'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'chm' AND lang_code3t = 'chm' AND lang_name = 'Mari' AND standard_language_id = '6371');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'chn', 'chn', 'Chinook jargon', '6372'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'chn' AND lang_code3t = 'chn' AND lang_name = 'Chinook jargon' AND standard_language_id = '6372');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'cho', 'cho', 'Choctaw', '6373'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'cho' AND lang_code3t = 'cho' AND lang_name = 'Choctaw' AND standard_language_id = '6373');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'chp', 'chp', 'Chipewyan', '6374'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'chp' AND lang_code3t = 'chp' AND lang_name = 'Chipewyan' AND standard_language_id = '6374');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'chr', 'chr', 'Cherokee', '6375'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'chr' AND lang_code3t = 'chr' AND lang_name = 'Cherokee' AND standard_language_id = '6375');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'cu', 'chu', 'chu', 'Church Slavic', '6376'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'cu' AND lang_code3b = 'chu' AND lang_code3t = 'chu' AND lang_name = 'Church Slavic' AND standard_language_id = '6376');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'cv', 'chv', 'chv', 'Chuvash', '6377'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'cv' AND lang_code3b = 'chv' AND lang_code3t = 'chv' AND lang_name = 'Chuvash' AND standard_language_id = '6377');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'chy', 'chy', 'Cheyenne', '6378'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'chy' AND lang_code3t = 'chy' AND lang_name = 'Cheyenne' AND standard_language_id = '6378');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'cmc', 'cmc', 'Chamic languages', '6379'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'cmc' AND lang_code3t = 'cmc' AND lang_name = 'Chamic languages' AND standard_language_id = '6379');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'cop', 'cop', 'Coptic', '6380'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'cop' AND lang_code3t = 'cop' AND lang_name = 'Coptic' AND standard_language_id = '6380');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kw', 'cor', 'cor', 'Cornish', '6381'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'kw' AND lang_code3b = 'cor' AND lang_code3t = 'cor' AND lang_name = 'Cornish' AND standard_language_id = '6381');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'co', 'cos', 'cos', 'Romance', 'Corsican', '6382'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'co' AND lang_code3b = 'cos' AND lang_code3t = 'cos' AND lang_family = 'Romance' AND lang_name = 'Corsican' AND standard_language_id = '6382');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'cpe', 'cpe', 'Creoles and pidgins, English based (Other)', '6383'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'cpe' AND lang_code3t = 'cpe' AND lang_name = 'Creoles and pidgins, English based (Other)' AND standard_language_id = '6383');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'cpf', 'cpf', 'Creoles and pidgins, French-based (Other)', '6384'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'cpf' AND lang_code3t = 'cpf' AND lang_name = 'Creoles and pidgins, French-based (Other)' AND standard_language_id = '6384');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'cpp', 'cpp', 'Creoles and pidgins, Portuguese-based (Other)', '6385'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'cpp' AND lang_code3t = 'cpp' AND lang_name = 'Creoles and pidgins, Portuguese-based (Other)' AND standard_language_id = '6385');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'cre', 'cre', 'Cree', '6386'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'cre' AND lang_code3t = 'cre' AND lang_name = 'Cree' AND standard_language_id = '6386');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'crp', 'crp', 'Creoles and pidgins (Other)', '6387'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'crp' AND lang_code3t = 'crp' AND lang_name = 'Creoles and pidgins (Other)' AND standard_language_id = '6387');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'cus', 'cus', 'Cushitic (Other)', '6388'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'cus' AND lang_code3t = 'cus' AND lang_name = 'Cushitic (Other)' AND standard_language_id = '6388');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'cy', 'wel', 'cym', 'Celtic', 'Welsh', '6389'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'cy' AND lang_code3b = 'wel' AND lang_code3t = 'cym' AND lang_family = 'Celtic' AND lang_name = 'Welsh' AND standard_language_id = '6389');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'dak', 'dak', 'Dakota', '6390'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'dak' AND lang_code3t = 'dak' AND lang_name = 'Dakota' AND standard_language_id = '6390');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'da', 'dan', 'dan', 'Germanic', 'Danish', '6391'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'da' AND lang_code3b = 'dan' AND lang_code3t = 'dan' AND lang_family = 'Germanic' AND lang_name = 'Danish' AND standard_language_id = '6391');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'day', 'day', 'Dayak', '6392'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'day' AND lang_code3t = 'day' AND lang_name = 'Dayak' AND standard_language_id = '6392');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'del', 'del', 'Delaware', '6393'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'del' AND lang_code3t = 'del' AND lang_name = 'Delaware' AND standard_language_id = '6393');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'den', 'den', 'Slave (Athapascan)', '6394'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'den' AND lang_code3t = 'den' AND lang_name = 'Slave (Athapascan)' AND standard_language_id = '6394');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'de', 'ger', 'deu', 'Germanic', 'German', '6395'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'de' AND lang_code3b = 'ger' AND lang_code3t = 'deu' AND lang_family = 'Germanic' AND lang_name = 'German' AND standard_language_id = '6395');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'dgr', 'dgr', 'Dogrib', '6396'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'dgr' AND lang_code3t = 'dgr' AND lang_name = 'Dogrib' AND standard_language_id = '6396');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'din', 'din', 'Dinka', '6397'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'din' AND lang_code3t = 'din' AND lang_name = 'Dinka' AND standard_language_id = '6397');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'div', 'div', 'Divehi', '6398'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'div' AND lang_code3t = 'div' AND lang_name = 'Divehi' AND standard_language_id = '6398');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'doi', 'doi', 'Dogri', '6399'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'doi' AND lang_code3t = 'doi' AND lang_name = 'Dogri' AND standard_language_id = '6399');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'dra', 'dra', 'Dravidian (Other)', '6400'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'dra' AND lang_code3t = 'dra' AND lang_name = 'Dravidian (Other)' AND standard_language_id = '6400');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'dua', 'dua', 'Duala', '6401'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'dua' AND lang_code3t = 'dua' AND lang_name = 'Duala' AND standard_language_id = '6401');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'dum', 'dum', 'Dutch, Middle (ca. 1050-1350)', '6402'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'dum' AND lang_code3t = 'dum' AND lang_name = 'Dutch, Middle (ca. 1050-1350)' AND standard_language_id = '6402');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'dyu', 'dyu', 'Dyula', '6403'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'dyu' AND lang_code3t = 'dyu' AND lang_name = 'Dyula' AND standard_language_id = '6403');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'dz', 'dzo', 'dzo', 'Asian', 'Dzongkha', '6404'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'dz' AND lang_code3b = 'dzo' AND lang_code3t = 'dzo' AND lang_family = 'Asian' AND lang_name = 'Dzongkha' AND standard_language_id = '6404');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'efi', 'efi', 'Efik', '6405'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'efi' AND lang_code3t = 'efi' AND lang_name = 'Efik' AND standard_language_id = '6405');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'egy', 'egy', 'Egyptian (Ancient)', '6406'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'egy' AND lang_code3t = 'egy' AND lang_name = 'Egyptian (Ancient)' AND standard_language_id = '6406');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'eka', 'eka', 'Ekajuk', '6407'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'eka' AND lang_code3t = 'eka' AND lang_name = 'Ekajuk' AND standard_language_id = '6407');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'el', 'gre', 'ell', 'Latin/greek', 'Greek, Modern (1453-)', '6408'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'el' AND lang_code3b = 'gre' AND lang_code3t = 'ell' AND lang_family = 'Latin/greek' AND lang_name = 'Greek, Modern (1453-)' AND standard_language_id = '6408');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'elx', 'elx', 'Elamite', '6409'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'elx' AND lang_code3t = 'elx' AND lang_name = 'Elamite' AND standard_language_id = '6409');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'en', 'eng', 'eng', 'Germanic', 'English', '6410'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'en' AND lang_code3b = 'eng' AND lang_code3t = 'eng' AND lang_family = 'Germanic' AND lang_name = 'English' AND standard_language_id = '6410');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'enm', 'enm', 'English, Middle (1100-1500)', '6411'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'enm' AND lang_code3t = 'enm' AND lang_name = 'English, Middle (1100-1500)' AND standard_language_id = '6411');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'eo', 'epo', 'epo', 'International aux.', 'Esperanto', '6412'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'eo' AND lang_code3b = 'epo' AND lang_code3t = 'epo' AND lang_family = 'International aux.' AND lang_name = 'Esperanto' AND standard_language_id = '6412');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'et', 'est', 'est', 'Finno-ugric', 'Estonian', '6413'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'et' AND lang_code3b = 'est' AND lang_code3t = 'est' AND lang_family = 'Finno-ugric' AND lang_name = 'Estonian' AND standard_language_id = '6413');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'eu', 'baq', 'eus', 'Basque', 'Basque', '6414'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'eu' AND lang_code3b = 'baq' AND lang_code3t = 'eus' AND lang_family = 'Basque' AND lang_name = 'Basque' AND standard_language_id = '6414');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ewe', 'ewe', 'Ewe', '6415'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ewe' AND lang_code3t = 'ewe' AND lang_name = 'Ewe' AND standard_language_id = '6415');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ewo', 'ewo', 'Ewondo', '6416'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ewo' AND lang_code3t = 'ewo' AND lang_name = 'Ewondo' AND standard_language_id = '6416');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'fan', 'fan', 'Fang', '6417'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'fan' AND lang_code3t = 'fan' AND lang_name = 'Fang' AND standard_language_id = '6417');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'fo', 'fao', 'fao', 'Germanic', 'Faroese', '6418'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'fo' AND lang_code3b = 'fao' AND lang_code3t = 'fao' AND lang_family = 'Germanic' AND lang_name = 'Faroese' AND standard_language_id = '6418');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'fa', 'per', 'fas', 'Persian', '6419'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'fa' AND lang_code3b = 'per' AND lang_code3t = 'fas' AND lang_name = 'Persian' AND standard_language_id = '6419');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'fat', 'fat', 'Fanti', '6420'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'fat' AND lang_code3t = 'fat' AND lang_name = 'Fanti' AND standard_language_id = '6420');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'fj', 'fij', 'fij', 'Oceanic/indonesian', 'Fijian', '6421'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'fj' AND lang_code3b = 'fij' AND lang_code3t = 'fij' AND lang_family = 'Oceanic/indonesian' AND lang_name = 'Fijian' AND standard_language_id = '6421');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'fi', 'fin', 'fin', 'Finno-ugric', 'Finnish', '6422'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'fi' AND lang_code3b = 'fin' AND lang_code3t = 'fin' AND lang_family = 'Finno-ugric' AND lang_name = 'Finnish' AND standard_language_id = '6422');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'fiu', 'fiu', 'Finno-Ugrian (Other)', '6423'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'fiu' AND lang_code3t = 'fiu' AND lang_name = 'Finno-Ugrian (Other)' AND standard_language_id = '6423');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'fon', 'fon', 'Fon', '6424'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'fon' AND lang_code3t = 'fon' AND lang_name = 'Fon' AND standard_language_id = '6424');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'fr', 'fre', 'fra', 'Romance', 'French', '6425'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'fr' AND lang_code3b = 'fre' AND lang_code3t = 'fra' AND lang_family = 'Romance' AND lang_name = 'French' AND standard_language_id = '6425');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'frm', 'frm', 'French, Middle (ca. 1400-1600)', '6426'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'frm' AND lang_code3t = 'frm' AND lang_name = 'French, Middle (ca. 1400-1600)' AND standard_language_id = '6426');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'fro', 'fro', 'French, Old (842-ca. 1400)', '6427'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'fro' AND lang_code3t = 'fro' AND lang_name = 'French, Old (842-ca. 1400)' AND standard_language_id = '6427');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'fy', 'fry', 'fry', 'Germanic', 'Frisian', '6428'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'fy' AND lang_code3b = 'fry' AND lang_code3t = 'fry' AND lang_family = 'Germanic' AND lang_name = 'Frisian' AND standard_language_id = '6428');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ful', 'ful', 'Fulah', '6429'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ful' AND lang_code3t = 'ful' AND lang_name = 'Fulah' AND standard_language_id = '6429');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'fur', 'fur', 'Friulian', '6430'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'fur' AND lang_code3t = 'fur' AND lang_name = 'Friulian' AND standard_language_id = '6430');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'gaa', 'gaa', 'Ga', '6431'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'gaa' AND lang_code3t = 'gaa' AND lang_name = 'Ga' AND standard_language_id = '6431');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'gay', 'gay', 'Gayo', '6432'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'gay' AND lang_code3t = 'gay' AND lang_name = 'Gayo' AND standard_language_id = '6432');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'gba', 'gba', 'Gbaya', '6433'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'gba' AND lang_code3t = 'gba' AND lang_name = 'Gbaya' AND standard_language_id = '6433');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'gem', 'gem', 'Germanic (Other)', '6434'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'gem' AND lang_code3t = 'gem' AND lang_name = 'Germanic (Other)' AND standard_language_id = '6434');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'gez', 'gez', 'Geez', '6435'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'gez' AND lang_code3t = 'gez' AND lang_name = 'Geez' AND standard_language_id = '6435');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'gil', 'gil', 'Gilbertese', '6436'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'gil' AND lang_code3t = 'gil' AND lang_name = 'Gilbertese' AND standard_language_id = '6436');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'gd', 'gla', 'gla', 'Celtic', 'Gaelic (Scots)', '6437'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'gd' AND lang_code3b = 'gla' AND lang_code3t = 'gla' AND lang_family = 'Celtic' AND lang_name = 'Gaelic (Scots)' AND standard_language_id = '6437');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ga', 'gle', 'gle', 'Celtic', 'Irish', '6438'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ga' AND lang_code3b = 'gle' AND lang_code3t = 'gle' AND lang_family = 'Celtic' AND lang_name = 'Irish' AND standard_language_id = '6438');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'gl', 'glg', 'glg', 'Romance', 'Gallegan', '6439'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'gl' AND lang_code3b = 'glg' AND lang_code3t = 'glg' AND lang_family = 'Romance' AND lang_name = 'Gallegan' AND standard_language_id = '6439');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'gv', 'glv', 'glv', 'Manx', '6440'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'gv' AND lang_code3b = 'glv' AND lang_code3t = 'glv' AND lang_name = 'Manx' AND standard_language_id = '6440');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'gmh', 'gmh', 'German, Middle High (ca. 1050-1500)', '6441'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'gmh' AND lang_code3t = 'gmh' AND lang_name = 'German, Middle High (ca. 1050-1500)' AND standard_language_id = '6441');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'goh', 'goh', 'German, Old High (ca. 750-1050)', '6442'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'goh' AND lang_code3t = 'goh' AND lang_name = 'German, Old High (ca. 750-1050)' AND standard_language_id = '6442');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'gon', 'gon', 'Gondi', '6443'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'gon' AND lang_code3t = 'gon' AND lang_name = 'Gondi' AND standard_language_id = '6443');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'gor', 'gor', 'Gorontalo', '6444'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'gor' AND lang_code3t = 'gor' AND lang_name = 'Gorontalo' AND standard_language_id = '6444');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'got', 'got', 'Gothic', '6445'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'got' AND lang_code3t = 'got' AND lang_name = 'Gothic' AND standard_language_id = '6445');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'grb', 'grb', 'Grebo', '6446'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'grb' AND lang_code3t = 'grb' AND lang_name = 'Grebo' AND standard_language_id = '6446');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'grc', 'grc', 'Greek, Ancient (to 1453)', '6447'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'grc' AND lang_code3t = 'grc' AND lang_name = 'Greek, Ancient (to 1453)' AND standard_language_id = '6447');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'gn', 'grn', 'grn', 'Amerindian', 'Guarani', '6448'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'gn' AND lang_code3b = 'grn' AND lang_code3t = 'grn' AND lang_family = 'Amerindian' AND lang_name = 'Guarani' AND standard_language_id = '6448');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'gu', 'guj', 'guj', 'Indian', 'Gujarati', '6449'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'gu' AND lang_code3b = 'guj' AND lang_code3t = 'guj' AND lang_family = 'Indian' AND lang_name = 'Gujarati' AND standard_language_id = '6449');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'gwi', 'gwi', 'Gwich´in', '6450'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'gwi' AND lang_code3t = 'gwi' AND lang_name = 'Gwich´in' AND standard_language_id = '6450');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'hai', 'hai', 'Haida', '6451'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'hai' AND lang_code3t = 'hai' AND lang_name = 'Haida' AND standard_language_id = '6451');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ha', 'hau', 'hau', 'Negro-african', 'Hausa', '6452'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ha' AND lang_code3b = 'hau' AND lang_code3t = 'hau' AND lang_family = 'Negro-african' AND lang_name = 'Hausa' AND standard_language_id = '6452');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'haw', 'haw', 'Hawaiian', '6453'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'haw' AND lang_code3t = 'haw' AND lang_name = 'Hawaiian' AND standard_language_id = '6453');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'he', 'heb', 'heb', 'Hebrew', '6454'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'he' AND lang_code3b = 'heb' AND lang_code3t = 'heb' AND lang_name = 'Hebrew' AND standard_language_id = '6454');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'hz', 'her', 'her', 'Herero', '6455'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'hz' AND lang_code3b = 'her' AND lang_code3t = 'her' AND lang_name = 'Herero' AND standard_language_id = '6455');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'hil', 'hil', 'Hiligaynon', '6456'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'hil' AND lang_code3t = 'hil' AND lang_name = 'Hiligaynon' AND standard_language_id = '6456');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'him', 'him', 'Himachali', '6457'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'him' AND lang_code3t = 'him' AND lang_name = 'Himachali' AND standard_language_id = '6457');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'hi', 'hin', 'hin', 'Indian', 'Hindi', '6458'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'hi' AND lang_code3b = 'hin' AND lang_code3t = 'hin' AND lang_family = 'Indian' AND lang_name = 'Hindi' AND standard_language_id = '6458');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'hit', 'hit', 'Hittite', '6459'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'hit' AND lang_code3t = 'hit' AND lang_name = 'Hittite' AND standard_language_id = '6459');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'hmn', 'hmn', 'Hmong', '6460'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'hmn' AND lang_code3t = 'hmn' AND lang_name = 'Hmong' AND standard_language_id = '6460');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ho', 'hmo', 'hmo', 'Hiri Motu', '6461'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ho' AND lang_code3b = 'hmo' AND lang_code3t = 'hmo' AND lang_name = 'Hiri Motu' AND standard_language_id = '6461');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'hr', 'scr', 'hrv', 'Slavic', 'Croatian', '6462'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'hr' AND lang_code3b = 'scr' AND lang_code3t = 'hrv' AND lang_family = 'Slavic' AND lang_name = 'Croatian' AND standard_language_id = '6462');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'hu', 'hun', 'hun', 'Finno-ugric', 'Hungarian', '6463'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'hu' AND lang_code3b = 'hun' AND lang_code3t = 'hun' AND lang_family = 'Finno-ugric' AND lang_name = 'Hungarian' AND standard_language_id = '6463');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'hup', 'hup', 'Hupa', '6464'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'hup' AND lang_code3t = 'hup' AND lang_name = 'Hupa' AND standard_language_id = '6464');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'hy', 'arm', 'hye', 'Indo-european (other)', 'Armenian', '6465'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'hy' AND lang_code3b = 'arm' AND lang_code3t = 'hye' AND lang_family = 'Indo-european (other)' AND lang_name = 'Armenian' AND standard_language_id = '6465');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'iba', 'iba', 'Iban', '6466'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'iba' AND lang_code3t = 'iba' AND lang_name = 'Iban' AND standard_language_id = '6466');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ibo', 'ibo', 'Igbo', '6467'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ibo' AND lang_code3t = 'ibo' AND lang_name = 'Igbo' AND standard_language_id = '6467');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ijo', 'ijo', 'Ijo', '6468'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ijo' AND lang_code3t = 'ijo' AND lang_name = 'Ijo' AND standard_language_id = '6468');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'iu', 'iku', 'iku', 'Inuktitut', '6469'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'iu' AND lang_code3b = 'iku' AND lang_code3t = 'iku' AND lang_name = 'Inuktitut' AND standard_language_id = '6469');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ie', 'ile', 'ile', 'International aux.', 'Interlingue', '6470'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ie' AND lang_code3b = 'ile' AND lang_code3t = 'ile' AND lang_family = 'International aux.' AND lang_name = 'Interlingue' AND standard_language_id = '6470');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ilo', 'ilo', 'Iloko', '6471'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ilo' AND lang_code3t = 'ilo' AND lang_name = 'Iloko' AND standard_language_id = '6471');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ia', 'ina', 'ina', 'International aux.', 'Interlingua', '6472'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ia' AND lang_code3b = 'ina' AND lang_code3t = 'ina' AND lang_family = 'International aux.' AND lang_name = 'Interlingua' AND standard_language_id = '6472');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'inc', 'inc', 'Indic (Other)', '6473'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'inc' AND lang_code3t = 'inc' AND lang_name = 'Indic (Other)' AND standard_language_id = '6473');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'id', 'ind', 'ind', 'Indonesian', '6474'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'id' AND lang_code3b = 'ind' AND lang_code3t = 'ind' AND lang_name = 'Indonesian' AND standard_language_id = '6474');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ine', 'ine', 'Indo-European (Other)', '6475'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ine' AND lang_code3t = 'ine' AND lang_name = 'Indo-European (Other)' AND standard_language_id = '6475');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ik', 'ipk', 'ipk', 'Eskimo', 'Inupiaq', '6476'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ik' AND lang_code3b = 'ipk' AND lang_code3t = 'ipk' AND lang_family = 'Eskimo' AND lang_name = 'Inupiaq' AND standard_language_id = '6476');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ira', 'ira', 'Iranian (Other)', '6477'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ira' AND lang_code3t = 'ira' AND lang_name = 'Iranian (Other)' AND standard_language_id = '6477');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'iro', 'iro', 'Iroquoian languages', '6478'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'iro' AND lang_code3t = 'iro' AND lang_name = 'Iroquoian languages' AND standard_language_id = '6478');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'is', 'ice', 'isl', 'Germanic', 'Icelandic', '6479'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'is' AND lang_code3b = 'ice' AND lang_code3t = 'isl' AND lang_family = 'Germanic' AND lang_name = 'Icelandic' AND standard_language_id = '6479');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'it', 'ita', 'ita', 'Romance', 'Italian', '6480'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'it' AND lang_code3b = 'ita' AND lang_code3t = 'ita' AND lang_family = 'Romance' AND lang_name = 'Italian' AND standard_language_id = '6480');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'jw', 'jav', 'jaw', 'Javanese', '6481'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'jw' AND lang_code3b = 'jav' AND lang_code3t = 'jaw' AND lang_name = 'Javanese' AND standard_language_id = '6481');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ja', 'jpn', 'jpn', 'Asian', 'Japanese', '6482'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ja' AND lang_code3b = 'jpn' AND lang_code3t = 'jpn' AND lang_family = 'Asian' AND lang_name = 'Japanese' AND standard_language_id = '6482');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'jpr', 'jpr', 'Judeo-Persian', '6483'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'jpr' AND lang_code3t = 'jpr' AND lang_name = 'Judeo-Persian' AND standard_language_id = '6483');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kaa', 'kaa', 'Kara-Kalpak', '6484'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kaa' AND lang_code3t = 'kaa' AND lang_name = 'Kara-Kalpak' AND standard_language_id = '6484');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kab', 'kab', 'Kabyle', '6485'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kab' AND lang_code3t = 'kab' AND lang_name = 'Kabyle' AND standard_language_id = '6485');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kac', 'kac', 'Kachin', '6486'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kac' AND lang_code3t = 'kac' AND lang_name = 'Kachin' AND standard_language_id = '6486');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'kl', 'kal', 'kal', 'Eskimo', 'Kalaallisut', '6487'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'kl' AND lang_code3b = 'kal' AND lang_code3t = 'kal' AND lang_family = 'Eskimo' AND lang_name = 'Kalaallisut' AND standard_language_id = '6487');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kam', 'kam', 'Kamba', '6488'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kam' AND lang_code3t = 'kam' AND lang_name = 'Kamba' AND standard_language_id = '6488');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'kn', 'kan', 'kan', 'Dravidian', 'Kannada', '6489'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'kn' AND lang_code3b = 'kan' AND lang_code3t = 'kan' AND lang_family = 'Dravidian' AND lang_name = 'Kannada' AND standard_language_id = '6489');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kar', 'kar', 'Karen', '6490'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kar' AND lang_code3t = 'kar' AND lang_name = 'Karen' AND standard_language_id = '6490');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ks', 'kas', 'kas', 'Indian', 'Kashmiri', '6491'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ks' AND lang_code3b = 'kas' AND lang_code3t = 'kas' AND lang_family = 'Indian' AND lang_name = 'Kashmiri' AND standard_language_id = '6491');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ka', 'geo', 'kat', 'Ibero-caucasian', 'Georgian', '6492'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ka' AND lang_code3b = 'geo' AND lang_code3t = 'kat' AND lang_family = 'Ibero-caucasian' AND lang_name = 'Georgian' AND standard_language_id = '6492');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kau', 'kau', 'Kanuri', '6493'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kau' AND lang_code3t = 'kau' AND lang_name = 'Kanuri' AND standard_language_id = '6493');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kaw', 'kaw', 'Kawi', '6494'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kaw' AND lang_code3t = 'kaw' AND lang_name = 'Kawi' AND standard_language_id = '6494');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'kk', 'kaz', 'kaz', 'Turkic/altaic', 'Kazakh', '6495'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'kk' AND lang_code3b = 'kaz' AND lang_code3t = 'kaz' AND lang_family = 'Turkic/altaic' AND lang_name = 'Kazakh' AND standard_language_id = '6495');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kha', 'kha', 'Khasi', '6496'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kha' AND lang_code3t = 'kha' AND lang_name = 'Khasi' AND standard_language_id = '6496');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'khi', 'khi', 'Khoisan (Other)', '6497'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'khi' AND lang_code3t = 'khi' AND lang_name = 'Khoisan (Other)' AND standard_language_id = '6497');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'km', 'khm', 'khm', 'Asian', 'Khmer', '6498'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'km' AND lang_code3b = 'khm' AND lang_code3t = 'khm' AND lang_family = 'Asian' AND lang_name = 'Khmer' AND standard_language_id = '6498');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kho', 'kho', 'Khotanese', '6499'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kho' AND lang_code3t = 'kho' AND lang_name = 'Khotanese' AND standard_language_id = '6499');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ki', 'kik', 'kik', 'Kikuyu', '6500'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ki' AND lang_code3b = 'kik' AND lang_code3t = 'kik' AND lang_name = 'Kikuyu' AND standard_language_id = '6500');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'rw', 'kin', 'kin', 'Negro-african', 'Kinyarwanda', '6501'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'rw' AND lang_code3b = 'kin' AND lang_code3t = 'kin' AND lang_family = 'Negro-african' AND lang_name = 'Kinyarwanda' AND standard_language_id = '6501');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ky', 'kir', 'kir', 'Turkic/altaic', 'Kirghiz', '6502'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ky' AND lang_code3b = 'kir' AND lang_code3t = 'kir' AND lang_family = 'Turkic/altaic' AND lang_name = 'Kirghiz' AND standard_language_id = '6502');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kmb', 'kmb', 'Kimbundu', '6503'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kmb' AND lang_code3t = 'kmb' AND lang_name = 'Kimbundu' AND standard_language_id = '6503');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kok', 'kok', 'Konkani', '6504'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kok' AND lang_code3t = 'kok' AND lang_name = 'Konkani' AND standard_language_id = '6504');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kv', 'kom', 'kom', 'Komi', '6505'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'kv' AND lang_code3b = 'kom' AND lang_code3t = 'kom' AND lang_name = 'Komi' AND standard_language_id = '6505');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kon', 'kon', 'Kongo', '6506'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kon' AND lang_code3t = 'kon' AND lang_name = 'Kongo' AND standard_language_id = '6506');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ko', 'kor', 'kor', 'Asian', 'Korean', '6507'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ko' AND lang_code3b = 'kor' AND lang_code3t = 'kor' AND lang_family = 'Asian' AND lang_name = 'Korean' AND standard_language_id = '6507');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kos', 'kos', 'Kosraean', '6508'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kos' AND lang_code3t = 'kos' AND lang_name = 'Kosraean' AND standard_language_id = '6508');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kpe', 'kpe', 'Kpelle', '6509'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kpe' AND lang_code3t = 'kpe' AND lang_name = 'Kpelle' AND standard_language_id = '6509');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kro', 'kro', 'Kru', '6510'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kro' AND lang_code3t = 'kro' AND lang_name = 'Kru' AND standard_language_id = '6510');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kru', 'kru', 'Kurukh', '6511'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kru' AND lang_code3t = 'kru' AND lang_name = 'Kurukh' AND standard_language_id = '6511');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kum', 'kum', 'Kumyk', '6512'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kum' AND lang_code3t = 'kum' AND lang_name = 'Kumyk' AND standard_language_id = '6512');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ku', 'kur', 'kur', 'Iranian', 'Kurdish', '6513'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ku' AND lang_code3b = 'kur' AND lang_code3t = 'kur' AND lang_family = 'Iranian' AND lang_name = 'Kurdish' AND standard_language_id = '6513');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'kut', 'kut', 'Kutenai', '6514'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'kut' AND lang_code3t = 'kut' AND lang_name = 'Kutenai' AND standard_language_id = '6514');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'lad', 'lad', 'Ladino', '6515'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'lad' AND lang_code3t = 'lad' AND lang_name = 'Ladino' AND standard_language_id = '6515');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'lah', 'lah', 'Lahnda', '6516'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'lah' AND lang_code3t = 'lah' AND lang_name = 'Lahnda' AND standard_language_id = '6516');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'lam', 'lam', 'Lamba', '6517'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'lam' AND lang_code3t = 'lam' AND lang_name = 'Lamba' AND standard_language_id = '6517');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'lo', 'lao', 'lao', 'Asian', 'Lao', '6518'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'lo' AND lang_code3b = 'lao' AND lang_code3t = 'lao' AND lang_family = 'Asian' AND lang_name = 'Lao' AND standard_language_id = '6518');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'la', 'lat', 'lat', 'Latin/greek', 'Latin', '6519'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'la' AND lang_code3b = 'lat' AND lang_code3t = 'lat' AND lang_family = 'Latin/greek' AND lang_name = 'Latin' AND standard_language_id = '6519');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'lv', 'lav', 'lav', 'Baltic', 'Latvian', '6520'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'lv' AND lang_code3b = 'lav' AND lang_code3t = 'lav' AND lang_family = 'Baltic' AND lang_name = 'Latvian' AND standard_language_id = '6520');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'lez', 'lez', 'Lezghian', '6521'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'lez' AND lang_code3t = 'lez' AND lang_name = 'Lezghian' AND standard_language_id = '6521');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ln', 'lin', 'lin', 'Negro-african', 'Lingala', '6522'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ln' AND lang_code3b = 'lin' AND lang_code3t = 'lin' AND lang_family = 'Negro-african' AND lang_name = 'Lingala' AND standard_language_id = '6522');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'lt', 'lit', 'lit', 'Baltic', 'Lithuanian', '6523'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'lt' AND lang_code3b = 'lit' AND lang_code3t = 'lit' AND lang_family = 'Baltic' AND lang_name = 'Lithuanian' AND standard_language_id = '6523');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'lol', 'lol', 'Mongo', '6524'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'lol' AND lang_code3t = 'lol' AND lang_name = 'Mongo' AND standard_language_id = '6524');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'loz', 'loz', 'Lozi', '6525'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'loz' AND lang_code3t = 'loz' AND lang_name = 'Lozi' AND standard_language_id = '6525');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'lb', 'ltz', 'ltz', 'Letzeburgesch', '6526'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'lb' AND lang_code3b = 'ltz' AND lang_code3t = 'ltz' AND lang_name = 'Letzeburgesch' AND standard_language_id = '6526');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'lua', 'lua', 'Luba-Lulua', '6527'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'lua' AND lang_code3t = 'lua' AND lang_name = 'Luba-Lulua' AND standard_language_id = '6527');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'lub', 'lub', 'Luba-Katanga', '6528'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'lub' AND lang_code3t = 'lub' AND lang_name = 'Luba-Katanga' AND standard_language_id = '6528');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'lug', 'lug', 'Ganda', '6529'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'lug' AND lang_code3t = 'lug' AND lang_name = 'Ganda' AND standard_language_id = '6529');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'lui', 'lui', 'Luiseno', '6530'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'lui' AND lang_code3t = 'lui' AND lang_name = 'Luiseno' AND standard_language_id = '6530');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'lun', 'lun', 'Lunda', '6531'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'lun' AND lang_code3t = 'lun' AND lang_name = 'Lunda' AND standard_language_id = '6531');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'luo', 'luo', 'Luo (Kenya and Tanzania)', '6532'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'luo' AND lang_code3t = 'luo' AND lang_name = 'Luo (Kenya and Tanzania)' AND standard_language_id = '6532');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'lus', 'lus', 'lushai', '6533'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'lus' AND lang_code3t = 'lus' AND lang_name = 'lushai' AND standard_language_id = '6533');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mad', 'mad', 'Madurese', '6534'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mad' AND lang_code3t = 'mad' AND lang_name = 'Madurese' AND standard_language_id = '6534');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mag', 'mag', 'Magahi', '6535'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mag' AND lang_code3t = 'mag' AND lang_name = 'Magahi' AND standard_language_id = '6535');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mh', 'mah', 'mah', 'Marshall', '6536'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'mh' AND lang_code3b = 'mah' AND lang_code3t = 'mah' AND lang_name = 'Marshall' AND standard_language_id = '6536');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mai', 'mai', 'Maithili', '6537'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mai' AND lang_code3t = 'mai' AND lang_name = 'Maithili' AND standard_language_id = '6537');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mak', 'mak', 'Makasar', '6538'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mak' AND lang_code3t = 'mak' AND lang_name = 'Makasar' AND standard_language_id = '6538');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ml', 'mal', 'mal', 'Dravidian', 'Malayalam', '6539'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ml' AND lang_code3b = 'mal' AND lang_code3t = 'mal' AND lang_family = 'Dravidian' AND lang_name = 'Malayalam' AND standard_language_id = '6539');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'man', 'man', 'Mandingo', '6540'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'man' AND lang_code3t = 'man' AND lang_name = 'Mandingo' AND standard_language_id = '6540');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'map', 'map', 'Austronesian (Other)', '6541'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'map' AND lang_code3t = 'map' AND lang_name = 'Austronesian (Other)' AND standard_language_id = '6541');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'mr', 'mar', 'mar', 'Indian', 'Marathi', '6542'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'mr' AND lang_code3b = 'mar' AND lang_code3t = 'mar' AND lang_family = 'Indian' AND lang_name = 'Marathi' AND standard_language_id = '6542');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mas', 'mas', 'Masai', '6543'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mas' AND lang_code3t = 'mas' AND lang_name = 'Masai' AND standard_language_id = '6543');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mdr', 'mdr', 'Mandar', '6544'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mdr' AND lang_code3t = 'mdr' AND lang_name = 'Mandar' AND standard_language_id = '6544');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'men', 'men', 'Mende', '6545'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'men' AND lang_code3t = 'men' AND lang_name = 'Mende' AND standard_language_id = '6545');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mga', 'mga', 'Irish, Middle (900-1200)', '6546'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mga' AND lang_code3t = 'mga' AND lang_name = 'Irish, Middle (900-1200)' AND standard_language_id = '6546');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mic', 'mic', 'Micmac', '6547'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mic' AND lang_code3t = 'mic' AND lang_name = 'Micmac' AND standard_language_id = '6547');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'min', 'min', 'Minangkabau', '6548'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'min' AND lang_code3t = 'min' AND lang_name = 'Minangkabau' AND standard_language_id = '6548');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mis', 'mis', 'Miscellaneous languages', '6549'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mis' AND lang_code3t = 'mis' AND lang_name = 'Miscellaneous languages' AND standard_language_id = '6549');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'mk', 'mac', 'mkd', 'Slavic', 'Macedonian', '6550'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'mk' AND lang_code3b = 'mac' AND lang_code3t = 'mkd' AND lang_family = 'Slavic' AND lang_name = 'Macedonian' AND standard_language_id = '6550');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mkh', 'mkh', 'Mon-Khmer (Other)', '6551'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mkh' AND lang_code3t = 'mkh' AND lang_name = 'Mon-Khmer (Other)' AND standard_language_id = '6551');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'mg', 'mlg', 'mlg', 'Oceanic/indonesian', 'Malagasy', '6552'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'mg' AND lang_code3b = 'mlg' AND lang_code3t = 'mlg' AND lang_family = 'Oceanic/indonesian' AND lang_name = 'Malagasy' AND standard_language_id = '6552');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'mt', 'mlt', 'mlt', 'Semitic', 'Maltese', '6553'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'mt' AND lang_code3b = 'mlt' AND lang_code3t = 'mlt' AND lang_family = 'Semitic' AND lang_name = 'Maltese' AND standard_language_id = '6553');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mnc', 'mnc', 'Manchu', '6554'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mnc' AND lang_code3t = 'mnc' AND lang_name = 'Manchu' AND standard_language_id = '6554');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mni', 'mni', 'Manipuri', '6555'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mni' AND lang_code3t = 'mni' AND lang_name = 'Manipuri' AND standard_language_id = '6555');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mno', 'mno', 'Manobo languages', '6556'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mno' AND lang_code3t = 'mno' AND lang_name = 'Manobo languages' AND standard_language_id = '6556');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'moh', 'moh', 'Mohawk', '6557'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'moh' AND lang_code3t = 'moh' AND lang_name = 'Mohawk' AND standard_language_id = '6557');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'mo', 'mol', 'mol', 'Romance', 'Moldavian', '6558'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'mo' AND lang_code3b = 'mol' AND lang_code3t = 'mol' AND lang_family = 'Romance' AND lang_name = 'Moldavian' AND standard_language_id = '6558');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mn', 'mon', 'mon', 'Mongolian', '6559'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'mn' AND lang_code3b = 'mon' AND lang_code3t = 'mon' AND lang_name = 'Mongolian' AND standard_language_id = '6559');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mos', 'mos', 'Mossi', '6560'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mos' AND lang_code3t = 'mos' AND lang_name = 'Mossi' AND standard_language_id = '6560');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'mi', 'mao', 'mri', 'Oceanic/indonesian', 'Maori', '6561'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'mi' AND lang_code3b = 'mao' AND lang_code3t = 'mri' AND lang_family = 'Oceanic/indonesian' AND lang_name = 'Maori' AND standard_language_id = '6561');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ms', 'may', 'msa', 'Oceanic/indonesian', 'Malay', '6562'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ms' AND lang_code3b = 'may' AND lang_code3t = 'msa' AND lang_family = 'Oceanic/indonesian' AND lang_name = 'Malay' AND standard_language_id = '6562');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mul', 'mul', 'Multiple languages', '6563'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mul' AND lang_code3t = 'mul' AND lang_name = 'Multiple languages' AND standard_language_id = '6563');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mun', 'mun', 'Munda languages', '6564'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mun' AND lang_code3t = 'mun' AND lang_name = 'Munda languages' AND standard_language_id = '6564');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mus', 'mus', 'Creek', '6565'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mus' AND lang_code3t = 'mus' AND lang_name = 'Creek' AND standard_language_id = '6565');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'mwr', 'mwr', 'Marwari', '6566'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'mwr' AND lang_code3t = 'mwr' AND lang_name = 'Marwari' AND standard_language_id = '6566');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'my', 'bur', 'mya', 'Asian', 'Burmese', '6567'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'my' AND lang_code3b = 'bur' AND lang_code3t = 'mya' AND lang_family = 'Asian' AND lang_name = 'Burmese' AND standard_language_id = '6567');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'myn', 'myn', 'Mayan languages', '6568'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'myn' AND lang_code3t = 'myn' AND lang_name = 'Mayan languages' AND standard_language_id = '6568');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'nah', 'nah', 'Nahuatl', '6569'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'nah' AND lang_code3t = 'nah' AND lang_name = 'Nahuatl' AND standard_language_id = '6569');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'nai', 'nai', 'North American Indian', '6570'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'nai' AND lang_code3t = 'nai' AND lang_name = 'North American Indian' AND standard_language_id = '6570');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'na', 'nau', 'nau', 'Nauru', '6571'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'na' AND lang_code3b = 'nau' AND lang_code3t = 'nau' AND lang_name = 'Nauru' AND standard_language_id = '6571');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'nv', 'nav', 'nav', 'Navajo', '6572'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'nv' AND lang_code3b = 'nav' AND lang_code3t = 'nav' AND lang_name = 'Navajo' AND standard_language_id = '6572');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'nr', 'nbl', 'nbl', 'Ndebele, South', '6573'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'nr' AND lang_code3b = 'nbl' AND lang_code3t = 'nbl' AND lang_name = 'Ndebele, South' AND standard_language_id = '6573');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'nd', 'nde', 'nde', 'Ndebele, North', '6574'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'nd' AND lang_code3b = 'nde' AND lang_code3t = 'nde' AND lang_name = 'Ndebele, North' AND standard_language_id = '6574');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ng', 'ndo', 'ndo', 'Ndonga', '6575'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ng' AND lang_code3b = 'ndo' AND lang_code3t = 'ndo' AND lang_name = 'Ndonga' AND standard_language_id = '6575');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'nds', 'nds', 'Low German; Low Saxon; German, Low; Saxon, Low', '6576'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'nds' AND lang_code3t = 'nds' AND lang_name = 'Low German; Low Saxon; German, Low; Saxon, Low' AND standard_language_id = '6576');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ne', 'nep', 'nep', 'Indian', 'Nepali', '6577'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ne' AND lang_code3b = 'nep' AND lang_code3t = 'nep' AND lang_family = 'Indian' AND lang_name = 'Nepali' AND standard_language_id = '6577');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'new', 'new', 'Newari', '6578'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'new' AND lang_code3t = 'new' AND lang_name = 'Newari' AND standard_language_id = '6578');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'nia', 'nia', 'Nias', '6579'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'nia' AND lang_code3t = 'nia' AND lang_name = 'Nias' AND standard_language_id = '6579');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'nic', 'nic', 'Niger-Kordofanian (Other)', '6580'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'nic' AND lang_code3t = 'nic' AND lang_name = 'Niger-Kordofanian (Other)' AND standard_language_id = '6580');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'niu', 'niu', 'Niuean', '6581'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'niu' AND lang_code3t = 'niu' AND lang_name = 'Niuean' AND standard_language_id = '6581');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'nl', 'dut', 'nld', 'Germanic', 'Dutch', '6582'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'nl' AND lang_code3b = 'dut' AND lang_code3t = 'nld' AND lang_family = 'Germanic' AND lang_name = 'Dutch' AND standard_language_id = '6582');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'nn', 'nno', 'nno', 'Norwegian Nynorsk', '6583'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'nn' AND lang_code3b = 'nno' AND lang_code3t = 'nno' AND lang_name = 'Norwegian Nynorsk' AND standard_language_id = '6583');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'nb', 'nob', 'nob', 'Norwegian Bokmål', '6584'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'nb' AND lang_code3b = 'nob' AND lang_code3t = 'nob' AND lang_name = 'Norwegian Bokmål' AND standard_language_id = '6584');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'non', 'non', 'Norse, Old', '6585'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'non' AND lang_code3t = 'non' AND lang_name = 'Norse, Old' AND standard_language_id = '6585');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'no', 'nor', 'nor', 'Germanic', 'Norwegian', '6586'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'no' AND lang_code3b = 'nor' AND lang_code3t = 'nor' AND lang_family = 'Germanic' AND lang_name = 'Norwegian' AND standard_language_id = '6586');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'nso', 'nso', 'Sotho, Northern', '6587'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'nso' AND lang_code3t = 'nso' AND lang_name = 'Sotho, Northern' AND standard_language_id = '6587');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'nub', 'nub', 'Nubian languages', '6588'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'nub' AND lang_code3t = 'nub' AND lang_name = 'Nubian languages' AND standard_language_id = '6588');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ny', 'nya', 'nya', 'Chichewa; Nyanja', '6589'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ny' AND lang_code3b = 'nya' AND lang_code3t = 'nya' AND lang_name = 'Chichewa; Nyanja' AND standard_language_id = '6589');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'nym', 'nym', 'Nyamwezi', '6590'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'nym' AND lang_code3t = 'nym' AND lang_name = 'Nyamwezi' AND standard_language_id = '6590');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'nyn', 'nyn', 'Nyankole', '6591'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'nyn' AND lang_code3t = 'nyn' AND lang_name = 'Nyankole' AND standard_language_id = '6591');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'nyo', 'nyo', 'Nyoro', '6592'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'nyo' AND lang_code3t = 'nyo' AND lang_name = 'Nyoro' AND standard_language_id = '6592');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'nzi', 'nzi', 'Nzima', '6593'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'nzi' AND lang_code3t = 'nzi' AND lang_name = 'Nzima' AND standard_language_id = '6593');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'oc', 'oci', 'oci', 'Romance', 'Occitan (post 1500); Provençal', '6594'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'oc' AND lang_code3b = 'oci' AND lang_code3t = 'oci' AND lang_family = 'Romance' AND lang_name = 'Occitan (post 1500); Provençal' AND standard_language_id = '6594');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'oji', 'oji', 'Ojibwa', '6595'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'oji' AND lang_code3t = 'oji' AND lang_name = 'Ojibwa' AND standard_language_id = '6595');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'or', 'ori', 'ori', 'Indian', 'Oriya', '6596'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'or' AND lang_code3b = 'ori' AND lang_code3t = 'ori' AND lang_family = 'Indian' AND lang_name = 'Oriya' AND standard_language_id = '6596');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'om', 'orm', 'orm', 'Hamitic', 'Oromo', '6597'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'om' AND lang_code3b = 'orm' AND lang_code3t = 'orm' AND lang_family = 'Hamitic' AND lang_name = 'Oromo' AND standard_language_id = '6597');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'osa', 'osa', 'Osage', '6598'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'osa' AND lang_code3t = 'osa' AND lang_name = 'Osage' AND standard_language_id = '6598');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'os', 'oss', 'oss', 'Ossetian; Ossetic', '6599'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'os' AND lang_code3b = 'oss' AND lang_code3t = 'oss' AND lang_name = 'Ossetian; Ossetic' AND standard_language_id = '6599');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ota', 'ota', 'Turkish, Ottoman (1500-1928)', '6600'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ota' AND lang_code3t = 'ota' AND lang_name = 'Turkish, Ottoman (1500-1928)' AND standard_language_id = '6600');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'oto', 'oto', 'Otomian languages', '6601'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'oto' AND lang_code3t = 'oto' AND lang_name = 'Otomian languages' AND standard_language_id = '6601');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'paa', 'paa', 'Papuan (Other)', '6602'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'paa' AND lang_code3t = 'paa' AND lang_name = 'Papuan (Other)' AND standard_language_id = '6602');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'pag', 'pag', 'Pangasinan', '6603'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'pag' AND lang_code3t = 'pag' AND lang_name = 'Pangasinan' AND standard_language_id = '6603');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'pal', 'pal', 'Pahlavi', '6604'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'pal' AND lang_code3t = 'pal' AND lang_name = 'Pahlavi' AND standard_language_id = '6604');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'pam', 'pam', 'Pampanga', '6605'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'pam' AND lang_code3t = 'pam' AND lang_name = 'Pampanga' AND standard_language_id = '6605');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'pa', 'pan', 'pan', 'Indian', 'Panjabi', '6606'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'pa' AND lang_code3b = 'pan' AND lang_code3t = 'pan' AND lang_family = 'Indian' AND lang_name = 'Panjabi' AND standard_language_id = '6606');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'pap', 'pap', 'Papiamento', '6607'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'pap' AND lang_code3t = 'pap' AND lang_name = 'Papiamento' AND standard_language_id = '6607');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'pau', 'pau', 'Palauan', '6608'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'pau' AND lang_code3t = 'pau' AND lang_name = 'Palauan' AND standard_language_id = '6608');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'peo', 'peo', 'Persian, Old (ca. 600-400 b.c.)', '6609'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'peo' AND lang_code3t = 'peo' AND lang_name = 'Persian, Old (ca. 600-400 b.c.)' AND standard_language_id = '6609');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'phi', 'phi', 'Philippine (Other)', '6610'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'phi' AND lang_code3t = 'phi' AND lang_name = 'Philippine (Other)' AND standard_language_id = '6610');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'pi', 'pli', 'pli', 'Pali', '6611'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'pi' AND lang_code3b = 'pli' AND lang_code3t = 'pli' AND lang_name = 'Pali' AND standard_language_id = '6611');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'pl', 'pol', 'pol', 'Slavic', 'Polish', '6612'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'pl' AND lang_code3b = 'pol' AND lang_code3t = 'pol' AND lang_family = 'Slavic' AND lang_name = 'Polish' AND standard_language_id = '6612');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'pon', 'pon', 'Pohnpeian', '6613'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'pon' AND lang_code3t = 'pon' AND lang_name = 'Pohnpeian' AND standard_language_id = '6613');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'pt', 'por', 'por', 'Romance', 'Portuguese', '6614'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'pt' AND lang_code3b = 'por' AND lang_code3t = 'por' AND lang_family = 'Romance' AND lang_name = 'Portuguese' AND standard_language_id = '6614');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'pra', 'pra', 'Prakrit languages', '6615'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'pra' AND lang_code3t = 'pra' AND lang_name = 'Prakrit languages' AND standard_language_id = '6615');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'pro', 'pro', 'Provençal, Old (to 1500)', '6616'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'pro' AND lang_code3t = 'pro' AND lang_name = 'Provençal, Old (to 1500)' AND standard_language_id = '6616');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ps', 'pus', 'pus', 'Iranian', 'Pushto', '6617'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ps' AND lang_code3b = 'pus' AND lang_code3t = 'pus' AND lang_family = 'Iranian' AND lang_name = 'Pushto' AND standard_language_id = '6617');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'qu', 'que', 'que', 'Amerindian', 'Quechua', '6618'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'qu' AND lang_code3b = 'que' AND lang_code3t = 'que' AND lang_family = 'Amerindian' AND lang_name = 'Quechua' AND standard_language_id = '6618');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'raj', 'raj', 'Rajasthani', '6619'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'raj' AND lang_code3t = 'raj' AND lang_name = 'Rajasthani' AND standard_language_id = '6619');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'rap', 'rap', 'Rapanui', '6620'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'rap' AND lang_code3t = 'rap' AND lang_name = 'Rapanui' AND standard_language_id = '6620');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'rar', 'rar', 'Rarotongan', '6621'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'rar' AND lang_code3t = 'rar' AND lang_name = 'Rarotongan' AND standard_language_id = '6621');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'roa', 'roa', 'Romance (Other)', '6622'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'roa' AND lang_code3t = 'roa' AND lang_name = 'Romance (Other)' AND standard_language_id = '6622');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'rom', 'rom', 'Romany', '6623'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'rom' AND lang_code3t = 'rom' AND lang_name = 'Romany' AND standard_language_id = '6623');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ro', 'rum', 'ron', 'Romance', 'Romanian', '6624'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ro' AND lang_code3b = 'rum' AND lang_code3t = 'ron' AND lang_family = 'Romance' AND lang_name = 'Romanian' AND standard_language_id = '6624');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'rn', 'run', 'run', 'Negro-african', 'Rundi', '6625'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'rn' AND lang_code3b = 'run' AND lang_code3t = 'run' AND lang_family = 'Negro-african' AND lang_name = 'Rundi' AND standard_language_id = '6625');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ru', 'rus', 'rus', 'Slavic', 'Russian', '6626'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ru' AND lang_code3b = 'rus' AND lang_code3t = 'rus' AND lang_family = 'Slavic' AND lang_name = 'Russian' AND standard_language_id = '6626');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sad', 'sad', 'Sandawe', '6627'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sad' AND lang_code3t = 'sad' AND lang_name = 'Sandawe' AND standard_language_id = '6627');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'sg', 'sag', 'sag', 'Negro-african', 'Sango', '6628'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'sg' AND lang_code3b = 'sag' AND lang_code3t = 'sag' AND lang_family = 'Negro-african' AND lang_name = 'Sango' AND standard_language_id = '6628');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sah', 'sah', 'Yakut', '6629'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sah' AND lang_code3t = 'sah' AND lang_name = 'Yakut' AND standard_language_id = '6629');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sai', 'sai', 'South American Indian (Other)', '6630'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sai' AND lang_code3t = 'sai' AND lang_name = 'South American Indian (Other)' AND standard_language_id = '6630');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sal', 'sal', 'Salishan languages', '6631'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sal' AND lang_code3t = 'sal' AND lang_name = 'Salishan languages' AND standard_language_id = '6631');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sam', 'sam', 'Samaritan Aramaic', '6632'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sam' AND lang_code3t = 'sam' AND lang_name = 'Samaritan Aramaic' AND standard_language_id = '6632');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'sa', 'san', 'san', 'Indian', 'Sanskrit', '6633'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'sa' AND lang_code3b = 'san' AND lang_code3t = 'san' AND lang_family = 'Indian' AND lang_name = 'Sanskrit' AND standard_language_id = '6633');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sas', 'sas', 'Sasak', '6634'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sas' AND lang_code3t = 'sas' AND lang_name = 'Sasak' AND standard_language_id = '6634');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sat', 'sat', 'Santali', '6635'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sat' AND lang_code3t = 'sat' AND lang_name = 'Santali' AND standard_language_id = '6635');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sco', 'sco', 'Scots', '6636'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sco' AND lang_code3t = 'sco' AND lang_name = 'Scots' AND standard_language_id = '6636');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sel', 'sel', 'Selkup', '6637'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sel' AND lang_code3t = 'sel' AND lang_name = 'Selkup' AND standard_language_id = '6637');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sem', 'sem', 'Semitic (Other)', '6638'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sem' AND lang_code3t = 'sem' AND lang_name = 'Semitic (Other)' AND standard_language_id = '6638');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sga', 'sga', 'Irish, Old (to 900)', '6639'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sga' AND lang_code3t = 'sga' AND lang_name = 'Irish, Old (to 900)' AND standard_language_id = '6639');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sgn', 'sgn', 'Sign Languages', '6640'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sgn' AND lang_code3t = 'sgn' AND lang_name = 'Sign Languages' AND standard_language_id = '6640');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'shn', 'shn', 'Shan', '6641'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'shn' AND lang_code3t = 'shn' AND lang_name = 'Shan' AND standard_language_id = '6641');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sid', 'sid', 'Sidamo', '6642'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sid' AND lang_code3t = 'sid' AND lang_name = 'Sidamo' AND standard_language_id = '6642');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'si', 'sin', 'sin', 'Indian', 'Sinhalese', '6643'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'si' AND lang_code3b = 'sin' AND lang_code3t = 'sin' AND lang_family = 'Indian' AND lang_name = 'Sinhalese' AND standard_language_id = '6643');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sio', 'sio', 'Siouan languages', '6644'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sio' AND lang_code3t = 'sio' AND lang_name = 'Siouan languages' AND standard_language_id = '6644');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sit', 'sit', 'Sino-Tibetan (Other)', '6645'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sit' AND lang_code3t = 'sit' AND lang_name = 'Sino-Tibetan (Other)' AND standard_language_id = '6645');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sla', 'sla', 'Slavic (Other)', '6646'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sla' AND lang_code3t = 'sla' AND lang_name = 'Slavic (Other)' AND standard_language_id = '6646');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'sk', 'slo', 'slk', 'Slavic', 'Slovak', '6647'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'sk' AND lang_code3b = 'slo' AND lang_code3t = 'slk' AND lang_family = 'Slavic' AND lang_name = 'Slovak' AND standard_language_id = '6647');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'sl', 'slv', 'slv', 'Slavic', 'Slovenian', '6648'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'sl' AND lang_code3b = 'slv' AND lang_code3t = 'slv' AND lang_family = 'Slavic' AND lang_name = 'Slovenian' AND standard_language_id = '6648');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'se', 'sme', 'sme', 'Northern Sami', '6649'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'se' AND lang_code3b = 'sme' AND lang_code3t = 'sme' AND lang_name = 'Northern Sami' AND standard_language_id = '6649');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'smi', 'smi', 'Sami languages (Other)', '6650'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'smi' AND lang_code3t = 'smi' AND lang_name = 'Sami languages (Other)' AND standard_language_id = '6650');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'sm', 'smo', 'smo', 'Oceanic/indonesian', 'Samoan', '6651'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'sm' AND lang_code3b = 'smo' AND lang_code3t = 'smo' AND lang_family = 'Oceanic/indonesian' AND lang_name = 'Samoan' AND standard_language_id = '6651');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'sn', 'sna', 'sna', 'Negro-african', 'Shona', '6652'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'sn' AND lang_code3b = 'sna' AND lang_code3t = 'sna' AND lang_family = 'Negro-african' AND lang_name = 'Shona' AND standard_language_id = '6652');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'sd', 'snd', 'snd', 'Indian', 'Sindhi', '6653'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'sd' AND lang_code3b = 'snd' AND lang_code3t = 'snd' AND lang_family = 'Indian' AND lang_name = 'Sindhi' AND standard_language_id = '6653');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'snk', 'snk', 'Soninke', '6654'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'snk' AND lang_code3t = 'snk' AND lang_name = 'Soninke' AND standard_language_id = '6654');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sog', 'sog', 'Sogdian', '6655'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sog' AND lang_code3t = 'sog' AND lang_name = 'Sogdian' AND standard_language_id = '6655');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'so', 'som', 'som', 'Hamitic', 'Somali', '6656'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'so' AND lang_code3b = 'som' AND lang_code3t = 'som' AND lang_family = 'Hamitic' AND lang_name = 'Somali' AND standard_language_id = '6656');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'son', 'son', 'Songhai', '6657'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'son' AND lang_code3t = 'son' AND lang_name = 'Songhai' AND standard_language_id = '6657');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'st', 'sot', 'sot', 'Negro-african', 'Sotho, Southern', '6658'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'st' AND lang_code3b = 'sot' AND lang_code3t = 'sot' AND lang_family = 'Negro-african' AND lang_name = 'Sotho, Southern' AND standard_language_id = '6658');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'es', 'spa', 'spa', 'Romance', 'Spanish', '6659'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'es' AND lang_code3b = 'spa' AND lang_code3t = 'spa' AND lang_family = 'Romance' AND lang_name = 'Spanish' AND standard_language_id = '6659');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'sq', 'alb', 'sqi', 'Indo-european (other)', 'Albanian', '6660'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'sq' AND lang_code3b = 'alb' AND lang_code3t = 'sqi' AND lang_family = 'Indo-european (other)' AND lang_name = 'Albanian' AND standard_language_id = '6660');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sc', 'srd', 'srd', 'Sardinian', '6661'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'sc' AND lang_code3b = 'srd' AND lang_code3t = 'srd' AND lang_name = 'Sardinian' AND standard_language_id = '6661');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'sr', 'scc', 'srp', 'Slavic', 'Serbian', '6662'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'sr' AND lang_code3b = 'scc' AND lang_code3t = 'srp' AND lang_family = 'Slavic' AND lang_name = 'Serbian' AND standard_language_id = '6662');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'srr', 'srr', 'Serer', '6663'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'srr' AND lang_code3t = 'srr' AND lang_name = 'Serer' AND standard_language_id = '6663');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ssa', 'ssa', 'Nilo-Saharan (Other)', '6664'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ssa' AND lang_code3t = 'ssa' AND lang_name = 'Nilo-Saharan (Other)' AND standard_language_id = '6664');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ss', 'ssw', 'ssw', 'Negro-african', 'Swati', '6665'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ss' AND lang_code3b = 'ssw' AND lang_code3t = 'ssw' AND lang_family = 'Negro-african' AND lang_name = 'Swati' AND standard_language_id = '6665');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'suk', 'suk', 'Sukuma', '6666'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'suk' AND lang_code3t = 'suk' AND lang_name = 'Sukuma' AND standard_language_id = '6666');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'su', 'sun', 'sun', 'Oceanic/indonesian', 'Sundanese', '6667'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'su' AND lang_code3b = 'sun' AND lang_code3t = 'sun' AND lang_family = 'Oceanic/indonesian' AND lang_name = 'Sundanese' AND standard_language_id = '6667');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sus', 'sus', 'Susu', '6668'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sus' AND lang_code3t = 'sus' AND lang_name = 'Susu' AND standard_language_id = '6668');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'sux', 'sux', 'Sumerian', '6669'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'sux' AND lang_code3t = 'sux' AND lang_name = 'Sumerian' AND standard_language_id = '6669');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'sw', 'swa', 'swa', 'Negro-african', 'Swahili', '6670'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'sw' AND lang_code3b = 'swa' AND lang_code3t = 'swa' AND lang_family = 'Negro-african' AND lang_name = 'Swahili' AND standard_language_id = '6670');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'sv', 'swe', 'swe', 'Germanic', 'Swedish', '6671'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'sv' AND lang_code3b = 'swe' AND lang_code3t = 'swe' AND lang_family = 'Germanic' AND lang_name = 'Swedish' AND standard_language_id = '6671');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'syr', 'syr', 'Syriac', '6672'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'syr' AND lang_code3t = 'syr' AND lang_name = 'Syriac' AND standard_language_id = '6672');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ty', 'tah', 'tah', 'Tahitian', '6673'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ty' AND lang_code3b = 'tah' AND lang_code3t = 'tah' AND lang_name = 'Tahitian' AND standard_language_id = '6673');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'tai', 'tai', 'Tai (Other)', '6674'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'tai' AND lang_code3t = 'tai' AND lang_name = 'Tai (Other)' AND standard_language_id = '6674');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ta', 'tam', 'tam', 'Dravidian', 'Tamil', '6675'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ta' AND lang_code3b = 'tam' AND lang_code3t = 'tam' AND lang_family = 'Dravidian' AND lang_name = 'Tamil' AND standard_language_id = '6675');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'tt', 'tat', 'tat', 'Turkic/altaic', 'Tatar', '6676'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'tt' AND lang_code3b = 'tat' AND lang_code3t = 'tat' AND lang_family = 'Turkic/altaic' AND lang_name = 'Tatar' AND standard_language_id = '6676');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'te', 'tel', 'tel', 'Dravidian', 'Telugu', '6677'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'te' AND lang_code3b = 'tel' AND lang_code3t = 'tel' AND lang_family = 'Dravidian' AND lang_name = 'Telugu' AND standard_language_id = '6677');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'tem', 'tem', 'Timne', '6678'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'tem' AND lang_code3t = 'tem' AND lang_name = 'Timne' AND standard_language_id = '6678');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ter', 'ter', 'Tereno', '6679'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ter' AND lang_code3t = 'ter' AND lang_name = 'Tereno' AND standard_language_id = '6679');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'tet', 'tet', 'Tetum', '6680'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'tet' AND lang_code3t = 'tet' AND lang_name = 'Tetum' AND standard_language_id = '6680');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'tg', 'tgk', 'tgk', 'Iranian', 'Tajik', '6681'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'tg' AND lang_code3b = 'tgk' AND lang_code3t = 'tgk' AND lang_family = 'Iranian' AND lang_name = 'Tajik' AND standard_language_id = '6681');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'tl', 'tgl', 'tgl', 'Oceanic/indonesian', 'Tagalog', '6682'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'tl' AND lang_code3b = 'tgl' AND lang_code3t = 'tgl' AND lang_family = 'Oceanic/indonesian' AND lang_name = 'Tagalog' AND standard_language_id = '6682');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'th', 'tha', 'tha', 'Asian', 'Thai', '6683'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'th' AND lang_code3b = 'tha' AND lang_code3t = 'tha' AND lang_family = 'Asian' AND lang_name = 'Thai' AND standard_language_id = '6683');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'tig', 'tig', 'Tigre', '6684'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'tig' AND lang_code3t = 'tig' AND lang_name = 'Tigre' AND standard_language_id = '6684');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ti', 'tir', 'tir', 'Semitic', 'Tigrinya', '6685'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ti' AND lang_code3b = 'tir' AND lang_code3t = 'tir' AND lang_family = 'Semitic' AND lang_name = 'Tigrinya' AND standard_language_id = '6685');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'tiv', 'tiv', 'Tiv', '6686'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'tiv' AND lang_code3t = 'tiv' AND lang_name = 'Tiv' AND standard_language_id = '6686');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'tkl', 'tkl', 'Tokelau', '6687'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'tkl' AND lang_code3t = 'tkl' AND lang_name = 'Tokelau' AND standard_language_id = '6687');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'tli', 'tli', 'Tlingit', '6688'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'tli' AND lang_code3t = 'tli' AND lang_name = 'Tlingit' AND standard_language_id = '6688');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'tmh', 'tmh', 'Tamashek', '6689'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'tmh' AND lang_code3t = 'tmh' AND lang_name = 'Tamashek' AND standard_language_id = '6689');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'tog', 'tog', 'Tonga (Nyasa)', '6690'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'tog' AND lang_code3t = 'tog' AND lang_name = 'Tonga (Nyasa)' AND standard_language_id = '6690');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'to', 'ton', 'ton', 'Oceanic/indonesian', 'Tonga (Tonga Islands)', '6691'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'to' AND lang_code3b = 'ton' AND lang_code3t = 'ton' AND lang_family = 'Oceanic/indonesian' AND lang_name = 'Tonga (Tonga Islands)' AND standard_language_id = '6691');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'tpi', 'tpi', 'Tok Pisin', '6692'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'tpi' AND lang_code3t = 'tpi' AND lang_name = 'Tok Pisin' AND standard_language_id = '6692');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'tsi', 'tsi', 'Tsimshian', '6693'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'tsi' AND lang_code3t = 'tsi' AND lang_name = 'Tsimshian' AND standard_language_id = '6693');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'tn', 'tsn', 'tsn', 'Negro-african', 'Tswana', '6694'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'tn' AND lang_code3b = 'tsn' AND lang_code3t = 'tsn' AND lang_family = 'Negro-african' AND lang_name = 'Tswana' AND standard_language_id = '6694');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ts', 'tso', 'tso', 'Negro-african', 'Tsonga', '6695'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ts' AND lang_code3b = 'tso' AND lang_code3t = 'tso' AND lang_family = 'Negro-african' AND lang_name = 'Tsonga' AND standard_language_id = '6695');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'tk', 'tuk', 'tuk', 'Turkic/altaic', 'Turkmen', '6696'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'tk' AND lang_code3b = 'tuk' AND lang_code3t = 'tuk' AND lang_family = 'Turkic/altaic' AND lang_name = 'Turkmen' AND standard_language_id = '6696');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'tum', 'tum', 'Tumbuka', '6697'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'tum' AND lang_code3t = 'tum' AND lang_name = 'Tumbuka' AND standard_language_id = '6697');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'tr', 'tur', 'tur', 'Turkic/altaic', 'Turkish', '6698'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'tr' AND lang_code3b = 'tur' AND lang_code3t = 'tur' AND lang_family = 'Turkic/altaic' AND lang_name = 'Turkish' AND standard_language_id = '6698');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'tut', 'tut', 'Altaic (Other)', '6699'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'tut' AND lang_code3t = 'tut' AND lang_name = 'Altaic (Other)' AND standard_language_id = '6699');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'tvl', 'tvl', 'Tuvalu', '6700'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'tvl' AND lang_code3t = 'tvl' AND lang_name = 'Tuvalu' AND standard_language_id = '6700');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'tw', 'twi', 'twi', 'Negro-african', 'Twi', '6701'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'tw' AND lang_code3b = 'twi' AND lang_code3t = 'twi' AND lang_family = 'Negro-african' AND lang_name = 'Twi' AND standard_language_id = '6701');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'tyv', 'tyv', 'Tuvinian', '6702'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'tyv' AND lang_code3t = 'tyv' AND lang_name = 'Tuvinian' AND standard_language_id = '6702');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'uga', 'uga', 'Ugaritic', '6703'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'uga' AND lang_code3t = 'uga' AND lang_name = 'Ugaritic' AND standard_language_id = '6703');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ug', 'uig', 'uig', 'Uighur', '6704'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ug' AND lang_code3b = 'uig' AND lang_code3t = 'uig' AND lang_name = 'Uighur' AND standard_language_id = '6704');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'uk', 'ukr', 'ukr', 'Slavic', 'Ukrainian', '6705'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'uk' AND lang_code3b = 'ukr' AND lang_code3t = 'ukr' AND lang_family = 'Slavic' AND lang_name = 'Ukrainian' AND standard_language_id = '6705');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'umb', 'umb', 'Umbundu', '6706'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'umb' AND lang_code3t = 'umb' AND lang_name = 'Umbundu' AND standard_language_id = '6706');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'und', 'und', 'Undetermined', '6707'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'und' AND lang_code3t = 'und' AND lang_name = 'Undetermined' AND standard_language_id = '6707');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'ur', 'urd', 'urd', 'Indian', 'Urdu', '6708'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'ur' AND lang_code3b = 'urd' AND lang_code3t = 'urd' AND lang_family = 'Indian' AND lang_name = 'Urdu' AND standard_language_id = '6708');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'uz', 'uzb', 'uzb', 'Turkic/altaic', 'Uzbek', '6709'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'uz' AND lang_code3b = 'uzb' AND lang_code3t = 'uzb' AND lang_family = 'Turkic/altaic' AND lang_name = 'Uzbek' AND standard_language_id = '6709');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'vai', 'vai', 'Vai', '6710'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'vai' AND lang_code3t = 'vai' AND lang_name = 'Vai' AND standard_language_id = '6710');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ven', 'ven', 'Venda', '6711'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ven' AND lang_code3t = 'ven' AND lang_name = 'Venda' AND standard_language_id = '6711');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'vi', 'vie', 'vie', 'Asian', 'Vietnamese', '6712'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'vi' AND lang_code3b = 'vie' AND lang_code3t = 'vie' AND lang_family = 'Asian' AND lang_name = 'Vietnamese' AND standard_language_id = '6712');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'vo', 'vol', 'vol', 'International aux.', 'Volapük', '6713'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'vo' AND lang_code3b = 'vol' AND lang_code3t = 'vol' AND lang_family = 'International aux.' AND lang_name = 'Volapük' AND standard_language_id = '6713');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'vot', 'vot', 'Votic', '6714'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'vot' AND lang_code3t = 'vot' AND lang_name = 'Votic' AND standard_language_id = '6714');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'wak', 'wak', 'Wakashan languages', '6715'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'wak' AND lang_code3t = 'wak' AND lang_name = 'Wakashan languages' AND standard_language_id = '6715');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'wal', 'wal', 'Walamo', '6716'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'wal' AND lang_code3t = 'wal' AND lang_name = 'Walamo' AND standard_language_id = '6716');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'war', 'war', 'Waray', '6717'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'war' AND lang_code3t = 'war' AND lang_name = 'Waray' AND standard_language_id = '6717');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'was', 'was', 'Washo', '6718'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'was' AND lang_code3t = 'was' AND lang_name = 'Washo' AND standard_language_id = '6718');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'wen', 'wen', 'Sorbian languages', '6719'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'wen' AND lang_code3t = 'wen' AND lang_name = 'Sorbian languages' AND standard_language_id = '6719');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'wo', 'wol', 'wol', 'Negro-african', 'Wolof', '6720'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'wo' AND lang_code3b = 'wol' AND lang_code3t = 'wol' AND lang_family = 'Negro-african' AND lang_name = 'Wolof' AND standard_language_id = '6720');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'xh', 'xho', 'xho', 'Negro-african', 'Xhosa', '6721'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'xh' AND lang_code3b = 'xho' AND lang_code3t = 'xho' AND lang_family = 'Negro-african' AND lang_name = 'Xhosa' AND standard_language_id = '6721');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'yao', 'yao', 'Yao', '6722'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'yao' AND lang_code3t = 'yao' AND lang_name = 'Yao' AND standard_language_id = '6722');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'yap', 'yap', 'Yapese', '6723'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'yap' AND lang_code3t = 'yap' AND lang_name = 'Yapese' AND standard_language_id = '6723');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'yi', 'yid', 'yid', 'Yiddish', '6724'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'yi' AND lang_code3b = 'yid' AND lang_code3t = 'yid' AND lang_name = 'Yiddish' AND standard_language_id = '6724');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'yo', 'yor', 'yor', 'Negro-african', 'Yoruba', '6725'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'yo' AND lang_code3b = 'yor' AND lang_code3t = 'yor' AND lang_family = 'Negro-african' AND lang_name = 'Yoruba' AND standard_language_id = '6725');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'ypk', 'ypk', 'Yupik languages', '6726'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'ypk' AND lang_code3t = 'ypk' AND lang_name = 'Yupik languages' AND standard_language_id = '6726');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'zap', 'zap', 'Zapotec', '6727'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'zap' AND lang_code3t = 'zap' AND lang_name = 'Zapotec' AND standard_language_id = '6727');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'zen', 'zen', 'Zenaga', '6728'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'zen' AND lang_code3t = 'zen' AND lang_name = 'Zenaga' AND standard_language_id = '6728');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'za', 'zha', 'zha', 'Zhuang', '6729'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'za' AND lang_code3b = 'zha' AND lang_code3t = 'zha' AND lang_name = 'Zhuang' AND standard_language_id = '6729');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'zh', 'chi', 'zho', 'Asian', 'Chinese', '6730'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'zh' AND lang_code3b = 'chi' AND lang_code3t = 'zho' AND lang_family = 'Asian' AND lang_name = 'Chinese' AND standard_language_id = '6730');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'znd', 'znd', 'Zande', '6731'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'znd' AND lang_code3t = 'znd' AND lang_name = 'Zande' AND standard_language_id = '6731');

INSERT INTO standard_language (lang_code2, lang_code3b, lang_code3t, lang_family, lang_name, standard_language_id)
SELECT 'zu', 'zul', 'zul', 'Negro-african', 'Zulu', '6732'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code2 = 'zu' AND lang_code3b = 'zul' AND lang_code3t = 'zul' AND lang_family = 'Negro-african' AND lang_name = 'Zulu' AND standard_language_id = '6732');

INSERT INTO standard_language (lang_code3b, lang_code3t, lang_name, standard_language_id)
SELECT 'zun', 'zun', 'Zuni', '6733'
WHERE NOT EXISTS (SELECT 1 FROM standard_language WHERE lang_code3b = 'zun' AND lang_code3t = 'zun' AND lang_name = 'Zuni' AND standard_language_id = '6733');
