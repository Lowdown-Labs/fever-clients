import unittest

from fever_client.api.corpus_api import CorpusApi

class TestCorpusApi(unittest.IsolatedAsyncioTestCase):

    async def asyncSetUp(self) -> None:
        self.api = CorpusApi()

    async def asyncTearDown(self) -> None:
        await self.api.api_client.close()

    async def test_corpus_stats(self) -> None:
        pass

if __name__ == '__main__':
    unittest.main()
